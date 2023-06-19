package chapter26_mhl.service;

import chapter26_mhl.dao.BillDAO;
import chapter26_mhl.dao.MultiTableDAO;
import chapter26_mhl.domain.Bill;
import chapter26_mhl.domain.MultiTableBean;

import java.util.List;
import java.util.UUID;

public class BillService {

    private BillDAO billDAO = new BillDAO();  //定义BillDAO属性
    private MenuService menuService = new MenuService();   //定义MenuService 属性
    private DiningTableService diningTableService = new DiningTableService();   //定义DiningTableService属性
    private MultiTableDAO multiTableDAO = new MultiTableDAO();

    public boolean orderMenu(int menuId, int nums, int diningTableId) {

        String billID = UUID.randomUUID().toString();  //生成一个账单号,UUID
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billID, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);
                                                                     //将账单生成到bill表, 要求直接计算账单金额
        if (update <= 0) {
            return false;
        }

        return diningTableService.updateDiningTableState(diningTableId, "就餐中");   //需要更新对应餐桌的状态

    }

    public List<Bill> list() {
        return billDAO.queryMulti("select * from bill", Bill.class);    //返回所有的账单， 提供给View调用
    }

    public List<MultiTableBean> list2() {
        return multiTableDAO.queryMulti("SELECT bill.*, NAME " +
                "FROM bill, menu " +
                "WHERE bill.menuId = menu.id", MultiTableBean.class);    //返回所有的账单并带有菜品名,价格， 提供给View调用
    }

    public boolean hasPayBillByDiningTableId(int diningTableId) {   //查看某个餐桌是否有未结账的账单

        Bill bill =
                billDAO.querySingle("SELECT * FROM bill WHERE diningTableId=? " +
                        "AND state = '未结账' LIMIT 0, 1", Bill.class, diningTableId);
        return bill != null;
    }

    //完成结账 （如果餐桌存在，并且该餐桌有未结账的账单），如果成功，返回true, 失败返回 false
    public boolean payBill(int diningTableId, String payMode) {

        //1. 修改bill表
        int update = billDAO.update("update bill set state=? where diningTableId=? " +
                "and state='未结账'", payMode, diningTableId);
        if(update <= 0) {
            return false;
        }

        //2. 修改diningTable表
        if(!diningTableService.updateDiningTableToFree(diningTableId, "空")) {
            return false;
        }
        return true;

    }
}

package chapter26_mhl.service;

import chapter26_mhl.dao.DiningTableDAO;
import chapter26_mhl.domain.DiningTable;

import java.util.List;

public class DiningTableService {

    private DiningTableDAO diningTableDAO = new DiningTableDAO();  //定义一个DiningTableDAO对象

    public List<DiningTable> list() {   //返回所有餐桌的信息

        return diningTableDAO.queryMulti("select id, state from " +
                "diningTable", DiningTable.class);
    }

    public DiningTable getDiningTableById(int id) {

        return diningTableDAO.querySingle("select * from diningTable " +
                "where id = ?", DiningTable.class, id);
    }

    public boolean orderDiningTable(int id, String orderName, String orderTel) {

        int update =
                diningTableDAO.update("update diningTable set state='已经预定', " +
                        "orderName=?, orderTel=? where id=?", orderName, orderTel, id);

        return  update > 0;
    }

    public boolean updateDiningTableState(int id, String state) {   //需要提供一个更新 餐桌状态的方法

        int update = diningTableDAO.update("update diningTable set state=? where id=?", state, id);

        return update > 0;
    }


    public boolean updateDiningTableToFree(int id, String state) {   //提供方法，将指定的餐桌设置为空闲状态

        int update = diningTableDAO.update("update diningTable set state=?,orderName='', " +
                "orderTel='' where id=?", state, id);
        return update > 0;

    }
}

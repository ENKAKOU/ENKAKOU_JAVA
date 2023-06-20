package chapter26_mhl.service;

import chapter26_mhl.dao.MenuDAO;
import chapter26_mhl.domain.Menu;

import java.util.List;

public class MenuService {

    private MenuDAO menuDAO = new MenuDAO();   //定义MenuDAO 属性

    public List<Menu> list() {

        return menuDAO.queryMulti("select * from menu", Menu.class);   //返回所有的菜品, 返回给界面使用
    }

    public Menu getMenuById(int id) {   //需要方法，根据id, 返回Menu对象
        return menuDAO.querySingle("select * from menu where id = ?", Menu.class, id);

    }
}

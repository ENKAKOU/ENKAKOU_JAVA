package chapter26_mhl.service;

import chapter26_mhl.dao.EmployeeDAO;
import chapter26_mhl.domain.Employee;

public class EmployeeService {

    private EmployeeDAO employeeDAO = new EmployeeDAO();   //定义一个 EmployeeDAO 属性

    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {

        return employeeDAO.querySingle("select * from employee where empId=? " +
                "and pwd=md5(?)", Employee.class, empId, pwd);

    }
}
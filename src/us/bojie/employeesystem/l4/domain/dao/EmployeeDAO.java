package us.bojie.employeesystem.l4.domain.dao;


import us.bojie.employeesystem.l4.domain.Employee;

/**
 * Created by bojiejiang on 7/5/17.
 */
public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        System.out.println("Saved Employee to the database " + employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Deleted Employee to the database " + employee);
    }
}

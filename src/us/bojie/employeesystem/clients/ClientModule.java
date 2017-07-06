package us.bojie.employeesystem.clients;

import us.bojie.employeesystem.domain.dao.EmployeeDAO;
import us.bojie.employeesystem.domain.Employee;
import us.bojie.employeesystem.reporting.EmployeeReportFormatter;
import us.bojie.employeesystem.reporting.FormatType;

/**
 * Created by bojiejiang on 7/5/17.
 */
public class ClientModule {

    public static void main(String[] args) {
        Employee peggy = new Employee(1,"peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}

package us.bojie.employeesystem.l10;

import java.util.Date;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class App {

    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireNewEmployee(bob);
//
        ems.modifyEmployeeName(6, "Imtiaz");
    }
}

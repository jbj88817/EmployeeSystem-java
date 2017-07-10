package us.bojie.employeesystem.l10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class EmployeeDAO {

    Employee emp1 = new Employee("Mike", null, 5000, true);
    Employee emp2 = new Employee("Steve", null, 4500, true);
    Employee emp3 = new Employee("John", null, 7000, true);
    Employee emp4 = new Employee("Pat", null, 6000, true);
    Employee emp5 = new Employee("Joe", null, 8000, true);

    List<Employee> mEmployees;

    public List<Employee> generateEmplyees() {
        mEmployees = new ArrayList<Employee>();
        mEmployees.add(emp1);
        mEmployees.add(emp2);
        mEmployees.add(emp3);
        mEmployees.add(emp4);
        mEmployees.add(emp5);

        return mEmployees;
    }

    public void addEmplyee(Employee emp) {
        mEmployees.add(emp);
    }
}

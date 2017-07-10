package us.bojie.employeesystem.l10;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class Utils {
    public static void dealWithTypes(Employee employee, EventType type) {
        switch (type) {
            case NEW_HIRE:
                System.out.println("New Hire: " + employee.getName());
                break;
            case NAME_EDIT:
                System.out.println("Employee Name Changed: " + employee.getName());
                break;
        }
    }
}

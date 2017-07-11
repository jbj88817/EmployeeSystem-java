package us.bojie.employeesystem.l10;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class PayrollDepartment implements IObserver {

    private static final String TAG = "PayrollDepartment";

    public void callMe(Employee emp, String msg) {
        System.out.println(TAG + " notified..");
        System.out.println(msg + emp.getName());
    }
}

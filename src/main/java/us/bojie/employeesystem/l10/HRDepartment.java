package us.bojie.employeesystem.l10;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class HRDepartment implements IObserver {

    private static final String TAG = "HRDepartment";

    public void callMe(Employee emp, String msg) {
        System.out.println(TAG + " notified..");
        System.out.println(msg + emp.getName());
    }
}

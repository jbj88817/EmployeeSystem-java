package us.bojie.employeesystem.l10;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class PayrollDepartment implements IObserver {

    private static final String TAG = "PayrollDepartment";

    public void callMe(Employee employee, EventType type) {
        onCallMe(employee, type);
    }

    private void onCallMe(Employee employee, EventType type) {
        System.out.println(TAG + " notified..");
        Utils.dealWithTypes(employee, type);
    }
}

package us.bojie.employeesystem.l10;

import static us.bojie.employeesystem.l10.Utils.dealWithTypes;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class HRDepartment implements IObserver {

    private static final String TAG = "HRDepartment";

    public void callMe(Employee employee, EventType type) {
        onCallMe(employee, type);
    }

    private void onCallMe(Employee employee, EventType type) {
        System.out.println(TAG + " notified..");
        dealWithTypes(employee, type);
    }

}

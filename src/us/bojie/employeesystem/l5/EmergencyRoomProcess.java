package us.bojie.employeesystem.l5;

/**
 * Created by bojiejiang on 7/6/17.
 */
public class EmergencyRoomProcess {

    public static void main(String[] args) {
        HospitalManagement hospitalManagement = new HospitalManagement();
        Employee peggy = new Nurse(1,"peggy", "emergency", true);
        hospitalManagement.callUpon(peggy);

        Employee suzan = new Doctor(2,"suzan", "emergency", true);
        hospitalManagement.callUpon(suzan);
    }
}

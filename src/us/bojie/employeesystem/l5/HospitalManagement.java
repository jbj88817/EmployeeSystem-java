package us.bojie.employeesystem.l5;

/**
 * Created by bojiejiang on 7/6/17.
 */
public class HospitalManagement {

    public void callUpon(Employee employee) {
        if (employee instanceof Nurse) {
            checkVitalSigns();
            drowBlood();
            cleanPatientArea();
        } else if (employee instanceof Doctor) {
            prescribeMedicine();
            diagnosePatients();
        }
    }
    // Nurse
    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    private void drowBlood() {
        System.out.println("drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("cleaning Patient Area");
    }

    // Doctors
    private void prescribeMedicine() {
        System.out.println("Prescrible Medicine");
    }

    private void diagnosePatients() {
        System.out.println("diagnosing Patient");
    }
}

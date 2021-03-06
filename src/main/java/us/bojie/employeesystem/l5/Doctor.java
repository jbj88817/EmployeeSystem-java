package us.bojie.employeesystem.l5;

/**
 * Created by bojiejiang on 7/6/17.
 */
public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    // Doctors
    private void prescribeMedicine() {
        System.out.println("Prescrible Medicine");
    }

    private void diagnosePatients() {
        System.out.println("diagnosing Patient");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
}

package us.bojie.employeesystem.l5;

/**
 * Created by bojiejiang on 7/6/17.
 */
public class Nurse extends Employee{

    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse is in action...");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drowBlood();
        cleanPatientArea();
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
}

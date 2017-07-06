package us.bojie.employeesystem.l5;

/**
 * Created by bojiejiang on 7/6/17.
 */
public class Nurse extends Employee{

    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse is in action...");
    }
}

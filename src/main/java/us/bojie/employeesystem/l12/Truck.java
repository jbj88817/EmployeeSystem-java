package us.bojie.employeesystem.l12;

/**
 * Created by bojiejiang on 7/11/17.
 */
public class Truck implements Vehicle {
    private static final String TAG = "Truck";

    public void startEngine() {
        System.out.println("Started " + TAG);
    }
}

package us.bojie.employeesystem.l9;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class App {

    public static void main(String[] args) {
        us.bojie.employeesystem.l9.Vehicle vehicle = new us.bojie.employeesystem.l9.Vehicle(new us.bojie.employeesystem.l9.SmallEngine(500));
        vehicle.crankIgnition();
    }
}

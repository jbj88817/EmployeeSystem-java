package us.bojie.employeesystem.l12;

/**
 * Created by bojiejiang on 7/11/17.
 */
public class App {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
//        Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.ELECTRIC);
        Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.TRUCK);
        vehicle.startEngine();
    }
}

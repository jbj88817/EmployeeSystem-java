package us.bojie.employeesystem.l12;

/**
 * Created by bojiejiang on 7/11/17.
 */
public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
        return vehicleType.getVehicle();
    }
}

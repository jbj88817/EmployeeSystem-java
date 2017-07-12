package us.bojie.employeesystem.l12;

/**
 * Created by bojiejiang on 7/11/17.
 */
public enum VehicleType {
    TRUCK {
        public Vehicle getVehicle() {
            return new Truck();
        }
    },
    CAR {
        public Vehicle getVehicle() {
            return new Car();
        }
    },
    ELECTRIC {
        public Vehicle getVehicle() {
            return new ElectricCar();
        }
    };

    abstract Vehicle getVehicle();
}

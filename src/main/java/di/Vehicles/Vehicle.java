package di.Vehicles;

import di.parts.Engine;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class Vehicle {
    private Engine mEngine;

    public Vehicle(Engine engine) {
        mEngine = engine;
    }

    public void crankIgnition() {
        mEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}

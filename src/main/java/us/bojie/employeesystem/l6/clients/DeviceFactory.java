package us.bojie.employeesystem.l6.clients;

import us.bojie.employeesystem.l6.processes.GeneralManufacturingProcess;
import us.bojie.employeesystem.l6.processes.SmartphoneManufacturingProcess;

/**
 * Created by bojiejiang on 7/8/17.
 */
public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess iphoneManufacturingProcess = new SmartphoneManufacturingProcess("Iphone process");
        iphoneManufacturingProcess.launchProcess();
    }
}

package us.bojie.employeesystem.l6.processes;

/**
 * Created by bojiejiang on 7/8/17.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    private static final String TAG = "SmartphoneManufacturing";

    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println(TAG + " assembleDevice");
    }

    @Override
    protected void testDevice() {
        System.out.println(TAG + " testDevice");
    }

    @Override
    protected void packageDevice() {
        System.out.println(TAG + " packageDevice");
    }

    @Override
    protected void storeDevice() {
        System.out.println(TAG + " storeDevice");
    }
}

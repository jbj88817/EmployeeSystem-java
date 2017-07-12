package us.bojie.employeesystem.l13;

/**
 * Created by bojiejiang on 7/11/17.
 */
public class PerformanceStage {

    private static PerformanceStage INSTANCE = null;
    private static int counter;
    private PerformanceStage() {
        counter++;
    }

    public synchronized static PerformanceStage getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights() {
        System.out.println("turnOnLights");
    }

    public int getCounter() {
        return counter;
    }
}

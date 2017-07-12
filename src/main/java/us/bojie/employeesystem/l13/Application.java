package us.bojie.employeesystem.l13;

/**
 * Created by bojiejiang on 7/11/17.
 */
public class Application {

    public static void main(String[] args) {
        PerformanceStage performanceStage = PerformanceStage.getInstance();
        performanceStage.turnOnLights();
        System.out.println(performanceStage.getCounter());

        PerformanceStage performanceStage1 = PerformanceStage.getInstance();
        performanceStage1.turnOnLights();
        System.out.println(performanceStage1.getCounter());
    }
}

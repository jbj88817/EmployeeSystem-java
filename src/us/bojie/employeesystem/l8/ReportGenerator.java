package us.bojie.employeesystem.l8;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class ReportGenerator {

    private Reporting mReporting;

    public void generateReport() {
        System.out.println(mReporting.getName() + " " + mReporting.productBreakDown() + " " + mReporting.getDate());
    }
}

package us.bojie.employeesystem.l7;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class SchoolStuff {

    private void makeAnnouncements() {
        System.out.println("makeAnnouncements ");
    }

    private void takeAttendence() {
        System.out.println("takeAttendence");
    }

    private void collectPaperWork() {
        System.out.println("collectPaperWork");
    }

    private void conductHallwayDuties() {
        System.out.println("conductHallwayDuties");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
        performOtherResponsibilities();
    }
}

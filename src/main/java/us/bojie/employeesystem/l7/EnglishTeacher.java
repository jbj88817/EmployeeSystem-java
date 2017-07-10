package us.bojie.employeesystem.l7;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class EnglishTeacher extends SchoolStuff implements CouseInstructor {

    @Override
    public void teach() {
        System.out.println("Taught English");
    }
}

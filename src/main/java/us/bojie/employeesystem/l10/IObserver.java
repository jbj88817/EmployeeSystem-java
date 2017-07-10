package us.bojie.employeesystem.l10;

/**
 * Created by bojiejiang on 7/10/17.
 */
public interface IObserver {
    void callMe(Employee employee, EventType type);
}

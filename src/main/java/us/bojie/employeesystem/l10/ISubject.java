package us.bojie.employeesystem.l10;

/**
 * Created by bojiejiang on 7/10/17.
 */
public interface ISubject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}

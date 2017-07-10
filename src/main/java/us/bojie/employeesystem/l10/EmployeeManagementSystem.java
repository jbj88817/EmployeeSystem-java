package us.bojie.employeesystem.l10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class EmployeeManagementSystem {
    private List<IObserver> mIObservers;
    private List<Employee> mEmployees;
    private EmployeeDAO mEmployeeDAO;

    public EmployeeManagementSystem() {
        mIObservers = new ArrayList<IObserver>();
        mEmployeeDAO = new EmployeeDAO();
        mEmployees = mEmployeeDAO.generateEmplyees();
    }

    public void registerObserver(IObserver observer) {
        mIObservers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        mIObservers.remove(observer);
    }

    public void hireNewEmployee(Employee employee) {
        mEmployeeDAO.addEmplyee(employee);
        notifyAllObservers(employee, EventType.NEW_HIRE);
    }

    public void modifyEmployeeName(int id, String name) {
        for (Employee employee : mEmployees) {
            if (id == employee.getEmpoyeeID()) {
                employee.setName(name);
                //todo update database
                notifyAllObservers(employee, EventType.NAME_EDIT);
            }
        }
    }

    private void notifyAllObservers(Employee employee, EventType type) {
        for (IObserver iObserver : mIObservers) {
            iObserver.callMe(employee, type);
        }
    }
}

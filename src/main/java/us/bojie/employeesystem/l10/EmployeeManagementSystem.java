package us.bojie.employeesystem.l10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class EmployeeManagementSystem implements ISubject {
    private List<IObserver> mIObservers;
    private List<Employee> mEmployees;
    private EmployeeDAO mEmployeeDAO;

    private Employee mEmployee;
    private String msg;

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

    public void notifyObservers() {
        for (IObserver departments : mIObservers) {
            departments.callMe(mEmployee, msg);
        }
    }

    public void hireNewEmployee(Employee employee) {
        mEmployee = employee;
        msg = "New Hire: ";
        mEmployees.add(employee);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String name) {
        boolean notify = false;
        for (Employee employee : mEmployees) {
            if (id == employee.getEmpoyeeID()) {
                employee.setName(name);
                //todo update database
                mEmployee = employee;
                msg = "Name changed: ";
               notify = true;
            }
        }
        if (notify) {
            notifyObservers();
        }
    }
}

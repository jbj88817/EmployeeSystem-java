package us.bojie.employeesystem.l10;

import java.util.Date;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class Employee {
    private String name;
    private Date hireDate;
    private int salary;
    public int empoyeeID;
    private boolean working = false;

    private static int COUNTER;

    public Employee(String name, Date hireDate, int salary, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;
        empoyeeID = ++COUNTER;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", empoyeeID=" + empoyeeID +
                ", working=" + working +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpoyeeID() {
        return empoyeeID;
    }
}

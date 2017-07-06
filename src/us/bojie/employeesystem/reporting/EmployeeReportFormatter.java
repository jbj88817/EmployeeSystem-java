package us.bojie.employeesystem.reporting;

import us.bojie.employeesystem.domain.Employee;

/**
 * Created by bojiejiang on 7/5/17.
 */
public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }


    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}

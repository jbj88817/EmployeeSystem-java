package us.bojie.employeesystem.l4.reporting;

/**
 * Created by bojiejiang on 7/5/17.
 */
public class ReportFormatter {

    private String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        return "XML";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV";
    }

    public String getFormattedValue() {
        return formattedOutput;
    }

}

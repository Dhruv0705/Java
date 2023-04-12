public class Employee{
    
    // Private fields to store employee name, id number, start timecard, end timecard, and level
    private String employee_name;
    private String employee_idNumber;
    private int employee_start_timecard;
    private int employee_end_timecard;
    private int employee_level;

    // Constructor to initialize the employee fields with the given parameters
    public Employee(String name, String id, int level, int start_timecard, int end_timecard){

        // Assign the values to the respective fields
        employee_name = name;
        employee_idNumber = id;
        employee_level = level;
        employee_start_timecard = start_timecard;
        employee_end_timecard = end_timecard;
    }

    // Getter method to return the employee name
    public String getEmployeeName () {
        return employee_name;
    }

    // Setter method to set the employee name
    public void setEmployeeName(String employeeName){
        this.employee_name = employeeName;
    }

    // Getter method to return the employee id number
    public String getEmployeeIdNumber() {
        return employee_idNumber;
    }

    // Getter method to return the employee level
    public int getEmployeeLevel() {
        return employee_level;
    }

    // Getter method to return the start timecard
    public int getEmployeeStartTimecard() {
        return employee_start_timecard;
    }

    // Setter method to set the start timecard
    public void setEmployeeStartTimecard(int employeeStartTimecard){
        this.employee_start_timecard = employeeStartTimecard;
    }

    // Getter method to return the end timecard
    public int getEmployeeEndTimecard() {
        return employee_end_timecard;
    }

    // Setter method to set the end timecard
    public void setEmployeeEndTimecard(int employeeEndTimecard){
        this.employee_end_timecard = employeeEndTimecard;
    }
}

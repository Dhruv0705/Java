
public class Employee{
    private String employee_name;
    private String employee_idNumber;
    private int employee_start_timecard;
    private int employee_end_timecard;
    public int employee_level;

    // Enter level of the employee for client (to later loop within bil according to level)
    public Employee(String name, String id, int level, int start_timecard, int end_timecard){
        employee_name = name;
        employee_idNumber = id;
        employee_level = level;
        employee_start_timecard = start_timecard;
        employee_end_timecard = end_timecard;
    }

    // Get and Set employee name 
    public String getemployee_name () {
        return employee_name;
    }

    public void setemployee_name(String employee_name){
        this.employee_name = employee_name;
    }

    // Get and Set employee timecard
    public int getemployee_start_timecard() {
        return employee_start_timecard;
    }

    public void setemployee_start_timecard(int employee_start_timecard){
        this.employee_start_timecard = employee_start_timecard;
    }

    public int getemployee_end_timecard() {
        return employee_end_timecard;
    }

    public void setemployee_end_timecard(int employee_end_timecard){
        this.employee_end_timecard = employee_end_timecard;
    }

}
package Employee;

import java.util.Scanner; 

public class SalaryEmployee extends Employee{
    private int MonthlyDaysWorked;
    private int SalaryPaycheck;

    public SalaryEmployee(int m, int p){
        MonthlyDaysWorked = m;
        SalaryPaycheck = p;
    }

    
    public int setSalary() {
        if (MonthlyDaysWorked <=15){
            SalaryPaycheck = (salary + salary);
        }
        else {
            System.out.print("You do not get paid yet There is" + (MonthlyDaysWorked-15) + "days left");
        }
        // return int salary 
        return salary;
    }
    

    
}
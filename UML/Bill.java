public class Bill {
    // private member variable to store the bill rate
    private double bill_rates;
    
    // Getter method to return the bill rate
    public double getBill_rate(){
        return bill_rates;
    }

    // Setter method to set the bill rate
    public void setBill_rate(double bill_rates){
        this.bill_rates = bill_rates;
    }

    // Method to calculate the bill rate based on the employee level
    public void calculateBillRate(int employee_level) {

        // Checking the employee level and setting the bill rate accordingly
        if(employee_level == 1) {
            bill_rates = 10.0;
        } else if(employee_level == 2) {
            bill_rates = 20.0;
        } else if(employee_level == 3) {
            bill_rates = 30.0;
        } else if (employee_level == 4) {
            bill_rates = 40.0;
        } else {
            bill_rates = 50.0;
        }
    }
}
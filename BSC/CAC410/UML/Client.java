public class Client extends Timecard{
    public String client_name;
    private int client_idNumber;

    // Constructor to initialize client name and id
    public Client (String name, int id) {
        client_name = name;
        client_idNumber = id;
    }

    // Getter for client id
    public int getClient_idNumber(){
        return client_idNumber;
    }

    // Setter for client id
    public void setClient_idNumber(int client_idNumber) {
        this.client_idNumber = client_idNumber;
    }

    // Getter for client name
    public String getClient_name(){
        return client_name;
    }

    // Setter for client name
    public void setClient_name(String client_name){
        this.client_name = client_name;
    }

    // Inner class to pay the bill based on the Timecard information
    public class PayBill{
        
        // Private field to store the total bill amount
        private int total_bill_amount;

        // Constructor to initialize the total bill amount
        public PayBill(int total_bill_amount){
            this.total_bill_amount = total_bill_amount;
        }

        // Getter for total bill amount
        public int getTotal_bill_amount(){
            return total_bill_amount;
        }

        // Setter for total bill amount
        public void setTotal_bill_amount(int total_bill_amount){
            this.total_bill_amount = total_bill_amount;
        }

        // Method to calculate the total bill amount
        public int calculateTotalBillAmount(int[] totalTime, int clientRate){
            // Calculate the total bill amount
            total_bill_amount = totalTime[0] * clientRate;
            // Return the total bill amount
            return total_bill_amount;
        }
    }
}



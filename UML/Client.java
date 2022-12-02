
public class Client extends Timecard{
    public String client_name;
    private int client_idNumber;

    // Get client id and name and if need to set or change element
    public Client (String name, int id) {
        client_name = name;
        client_idNumber = id;
    }
    public int getclient_idNumber(){
        return client_idNumber;
    }

    public void setclient_idNumber(int client_idNumber) {
        this.client_idNumber = client_idNumber;
    }

    public String getclient_name(){
        return client_name;
    }

    public void setclient_name(String client_name){
        this.client_name = client_name;
    }

    // Class to pay the bill onced recieved based on the Timecard and pay bill
    public class PayBill{
        //...
    }
}


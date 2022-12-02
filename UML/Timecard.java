public class Timecard {
    private int timecard_Client_Rate;
    public int timecard_start;
    public int timecard_end;

    public int gettimecard_Client_Rate(){
        return timecard_Client_Rate;
    }

    public void settimecard_Client_Rate(int timecard_Client_Rate){
        this.timecard_Client_Rate = timecard_Client_Rate;
    }

    // function for the start and end timecard to calculate and set within a new array
    //...
}


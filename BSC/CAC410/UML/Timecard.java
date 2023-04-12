public class Timecard {
    // Private field to store the client rate for the timecard
    private int timecard_Client_Rate;
    // Public fields to store the start and end time for the timecard
    public int timecard_start;
    public int timecard_end;

    // Getter method to return the client rate for the timecard
    public int getTimecardClientRate(){
        return timecard_Client_Rate;
    }

    // Setter method to set the client rate for the timecard
    public void setTimecardClientRate(int timecardClientRate){
        this.timecard_Client_Rate = timecardClientRate;
    }

    // Method to calculate the total time worked based on the start and end times
    public int[] calculateTotalTime(int start, int end) {
        // Array to store the total time worked in hours and minutes
        int[] totalTime = new int[2];
        // Calculate the number of hours worked
        int hours = end - start;
        // Calculate the number of minutes worked
        int minutes = (hours % 100) - (start % 100);
        // Convert the minutes worked into hours and store in the first index of the totalTime array
        totalTime[0] = hours + minutes / 60;
        // Store the remaining minutes in the second index of the totalTime array
        totalTime[1] = minutes % 60;
        // Return the total time worked in hours and minutes
        return totalTime;
    }
}

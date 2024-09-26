// clock Problem (we have to convert 24hr format into 12hr)

//I/p: hour = 12, minutes = 16

//I/p: hour = 4, minutes = 3

public class clockProblem {

    public static void convertTo12Hours(int hour, int minutes) {
        String period;

        // Determine if it's Am or PM
        if(hour >= 12) {
            period = "PM";
            if(hour > 12) {
                hour = hour - 12;
            }
        }
        else {
            period = "AM";
            if(hour == 0) {
                hour = 12;
            }
        }
        if(hour < 0 || hour > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time input!");
        }
        else {
            // Print in 12-hour format with leading zeros for minutes
            System.out.printf("12-hour format: %02d:%02d %s%n", hour, minutes, period);
        }
        
        
    }
    
    public static void main(String[] args) {

        convertTo12Hours(12, 16);
        convertTo12Hours(4, 3);
        convertTo12Hours(17, 45);
        convertTo12Hours(20, 28);
        convertTo12Hours(10, 56);
        
    }
}

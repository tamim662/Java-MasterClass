public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <0){
            return -1;
        }
        else if(kilometersPerHour>0){
            double milesPerHour = 0.6215*kilometersPerHour;
            milesPerHour = Math.round(milesPerHour);
            int newValue = (int) milesPerHour;
            return newValue;

        }
        return 0;

    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour <0){
            System.out.println("Invalid Value");
        }
        else if(kilometersPerHour>=0){
            double milesPerHour = 0.6215*kilometersPerHour;
            milesPerHour = Math.round(milesPerHour);
            int newValue = (int) milesPerHour;
            System.out.println(kilometersPerHour+" km/h = " + newValue + " mi/h");


        }
    }


}

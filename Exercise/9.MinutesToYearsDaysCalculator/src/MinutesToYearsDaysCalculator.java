public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1051200);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remaining_days = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remaining_days + " d");
        }
    }

}

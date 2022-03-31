import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg = 0;
        while(true) {
            boolean  isInt = scanner.hasNextInt();
            if(isInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else if(count == 0) {
                System.out.println("SUM = 0 AVG = 0");
                break;
            }
            else{
                avg = (int) Math.round((double) sum/ count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }



    }
}

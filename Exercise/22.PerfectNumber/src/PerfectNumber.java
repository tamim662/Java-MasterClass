public class PerfectNumber {
    public static void main(String[] args) {
        if(isPerfectNumber(6)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
    public static boolean isPerfectNumber(int number) {
        if(number<1) {
            return false;
        }
        int sum = 0;
        int i = 1;
        while (i != number) {
            if(number%i == 0) {
                sum += i;
            }

            i = i + 1;
        }
        return sum == number;
    }
}

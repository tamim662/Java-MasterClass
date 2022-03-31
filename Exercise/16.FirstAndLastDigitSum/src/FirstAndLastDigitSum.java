public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }
    public static int sumFirstAndLastDigit(int number) {
        if(number<0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number%10;
        while(number != 0) {
            firstDigit = number;
            number = number/10;
        }
        return firstDigit+lastDigit;

    }
}

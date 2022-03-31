public class LastDigitChecker {
    public static void main(String[] args) {

    }
    public static boolean isValid(int number) {
        if(number<10 || number>1000) {
            return false;
        }
        return true;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        int num1LastDigit, num2LastDigit, num3LastDigit;
        num1LastDigit = num1%10;
        num2LastDigit = num2%10;
        num3LastDigit = num3%10;
        if(num1LastDigit == num2LastDigit || num2LastDigit == num3LastDigit || num1LastDigit == num3LastDigit) {
            return true;
        }
        return false;
    }

}

public class NumberPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number) {
        int actualNumber = number;
        int reverse = 0;
        while(number != 0) {
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        return actualNumber == reverse;
    }
}

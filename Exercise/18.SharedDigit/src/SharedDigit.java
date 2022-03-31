public class SharedDigit {
    public static void main(String[] args) {
        if(hasSharedDigit(12, 13)) {
            System.out.println("Common Digit Exists");
        }
        else {
            System.out.println("No common digit Exists");
        }
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1<10 || num1>99 || num2<10 || num2>99) {
            return false;
        }
        int digitInNum1 = 0;
        int digitInNum2 = 0;
        while(num1 != 0) {
            digitInNum1 = num1%10;
            int number = num2;
            while(number != 0) {
                digitInNum2 = number%10;
                if(digitInNum1 == digitInNum2) {
                    return true;
                }
                number =number/10;
            }
            num1 = num1/10;
        }
        return false;

    }
}

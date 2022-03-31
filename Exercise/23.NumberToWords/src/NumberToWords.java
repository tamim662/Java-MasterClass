public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);

    }
    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        return reverse;
    }
    public static int getDigitCount(int number) {
        if(number<0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        while(number != 0) {
            count += 1;
            number = number/10;
        }
        return count;
    }
    public static void numberToWords(int number) {

        if(number<0) {
            System.out.println("Invalid Value");
        }
        if(number == 0) {
            System.out.println("Zero");
        }
        int totalDigitBeforeReverse = getDigitCount(number);
        int reverseNumber = reverse(number);
        int totalDigitAfterReverse = getDigitCount(reverseNumber);
        if(totalDigitBeforeReverse != totalDigitAfterReverse) {
            int difference = totalDigitBeforeReverse-totalDigitAfterReverse;

            while(reverseNumber != 0) {
                int digit = reverseNumber%10;
                switch(digit) {
                    case 0: {
                        System.out.println("Zero");
                        break;
                    }
                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }
                }
                reverseNumber = reverseNumber/10;
            }
            while(difference !=0) {
                System.out.println("Zero");
                difference -= 1;
            }

        }
        else {
            int digit;
            while(reverseNumber != 0) {
                digit = reverseNumber%10;
                switch(digit) {
                    case 0: {
                        System.out.println("Zero");
                        break;
                    }
                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }
                }
                reverseNumber = reverseNumber/10;
            }
        }


    }
}

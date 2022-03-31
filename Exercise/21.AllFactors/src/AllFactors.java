public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        int i = 1;
        if(number<0) {
            System.out.println("Invalid Value");
        }
        while (i <= number) {
            if(number%i == 0) {
                System.out.println(i);
            }

            i = i + 1;
        }

    }
}



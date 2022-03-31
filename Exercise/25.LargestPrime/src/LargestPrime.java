public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }
    public static int getLargestPrime(int number) {
        if(number<=1) {
            return -1;
        }
        int i = 2;
        int lastFactor = 0;
        while(i <= number) {
            if(number%i == 0) {
                int n = i;
                boolean flag = true;
                for(int j = 2 ; j<= n/2; j++) {
                    if(n%j == 0) {
                        flag = false;
                    }
                }
                if(flag == true) {
                    lastFactor = i;
                }

            }
            i = i + 1;
        }
        return lastFactor;
    }
}

public class GreatestCommonDivisior {
    public static void main(String[] args) {

    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first<10 || second<10) {
            return -1;
        }
        int number = 0;
        if(first>second){
            number = second;
        }
        else {
            number = first;
        }
        int i = 1;
        int gcd = 0;
        while(i<=number) {
            if(first%i == 0 && second%i ==0){
                gcd = i;
            }
            i = i+1;
        }
        return gcd;
    }
}

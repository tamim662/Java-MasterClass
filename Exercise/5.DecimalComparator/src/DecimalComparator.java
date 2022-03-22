public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, 3.175);

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int realnum1, realnum2;
        realnum1 = (int) (num1 * 1000);
        realnum2 = (int) (num2 * 1000);

        if(realnum1 == realnum2){
            return true;
        }
        else{
            return false;
        }

    }
}

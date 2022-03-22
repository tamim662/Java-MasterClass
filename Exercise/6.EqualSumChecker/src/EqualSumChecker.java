public class EqualSumChecker {
    public static void main(String[] args) {
        if (hasEqualSum(1,-1,0)){
            System.out.println("Equal!");

        }else{
            System.out.println("Not Equal!");
        }
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return (num1+num2) == num3;
    }
}

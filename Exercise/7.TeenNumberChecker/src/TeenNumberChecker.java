public class TeenNumberChecker {
    public static void main(String[] args) {

    }
    public static boolean isTeen(int number){
        if(number>=13 && number<=19){
            return true;
        }else{
            return false;
        }
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        if(isTeen(num1) == true || isTeen(num2) == true || isTeen(num3) == true){
            return true;
        }
        else{
            return false;
        }

    }
}

public class BarkingDog {
    public static void main(String[] args) {

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay>=0 && hourOfDay<=23){
            if(hourOfDay>=0 && hourOfDay<8 && barking == true){
                return true;
            }
            else if(hourOfDay>22 && hourOfDay <=23 && barking == true){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }
}

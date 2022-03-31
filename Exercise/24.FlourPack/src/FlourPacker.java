public class FlourPacker {
    public static void main(String[] args) {
        boolean result = canPack(2, 2, 12);
        if(result == true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
                if(bigCount<0 || smallCount<0 || goal<0) {
                    return false;
                }
                int leftOver = 0;
                while(bigCount>0 && goal>=5) {
                    goal = goal - 5;
                    bigCount -= 1;
                }
                while(smallCount>0 && goal>=1) {
                    goal = goal - 1;
            smallCount -= 1;
        }
        if(goal == 0) {
            return true;
        } else {
            return false;
        }
    }
}

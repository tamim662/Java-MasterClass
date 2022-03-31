import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] A = getIntegers(5);
        reverse(A);
//        printArray(A);

    }
    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];
        for(int i =0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
//    public static void printArray(int[] numbers) {
//        for(int i =0; i < numbers.length; i++) {
//            System.out.println("Element " + i + " contents " + numbers[i]);
//        }
//    }
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int last = array.length - 1;
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[last];
            array[last] = temp;
            last--;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}

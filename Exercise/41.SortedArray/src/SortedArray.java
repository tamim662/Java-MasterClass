import java.util.Scanner;

public class SortedArray {
    

    public static void main(String[] args) {
//        getIntegers(5);
        int[] unsortedArray = getIntegers(5);
        System.out.println("Before sorted");
        printArray(unsortedArray);
        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println("After sorted");
        printArray(sortedArray);

    }
    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];
        for(int i =0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] numbers) {
        for(int i =0; i < numbers.length; i++) {
            System.out.println("Element " + i + " contents " + numbers[i]);
        }
    }
    public static int[] sortIntegers(int[] numbers) {
        int size = numbers.length;;
        int[] array = new int[size];
        
        for(int i = 0; i < size; i++) {
            array[i] = numbers[i];
        }
        for(int i = 0; i < array.length - 1; i++) {

            for(int j = i+1; j < array.length; j++) {
                if(array[j]> array[i]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;

                }
            }

        }
        return array;
    }
}

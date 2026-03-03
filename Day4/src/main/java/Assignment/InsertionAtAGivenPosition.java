package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionAtAGivenPosition {

    public static int[] insertAt(int[] arr, int value, int position) {
        if (position < 0 || position > arr.length) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < position; i++) result[i] = arr[i];
        result[position] = value;
        for (int i = position; i < arr.length; i++) result[i + 1] = arr[i];
        return result;
        }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Original: ");
        printArray(arr);

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter position (0 to " + arr.length + "): ");
        int pos = sc.nextInt();

        try {
            int[] updated = insertAt(arr, value, pos);
            System.out.print("Updated:  ");
            printArray(updated);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        sc.close();
    }
}
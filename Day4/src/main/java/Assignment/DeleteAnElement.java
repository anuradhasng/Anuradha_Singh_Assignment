package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElement {

    public static int[] deleteAt(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < index; i++) result[i] = arr[i];
        for (int i = index + 1; i < arr.length; i++) result[i - 1] = arr[i];
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 70, 40, 60};
        System.out.print("Original: ");
        printArray(arr);

        System.out.print("Enter index to delete (0 to " + (arr.length - 1) + "): ");
        int index = sc.nextInt();

        try {
            int[] updated = deleteAt(arr, index);
            System.out.print("Updated:  ");
            printArray(updated);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        sc.close();
    }
}
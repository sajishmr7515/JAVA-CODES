import java.util.Scanner;

public class oneD_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nthe following elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

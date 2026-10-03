public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Calculates the middle index safely to avoid integer overflow
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid; 
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target was not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // IMPORTANT: The array must be sorted for binary search to work!
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int resultIndex = binarySearch(numbers, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

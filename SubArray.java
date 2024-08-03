public class PrintSubarrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        // Loop through the array to generate subarrays
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                // Print subarray from i to j
                printSubarray(nums, i, j);
            }
        }
    }

    // Helper method to print subarray from start to end indices
    private static void printSubarray(int[] array, int start, int end) {
        System.out.print("{ ");
        for (int k = start; k <= end; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println("}");
    }
}

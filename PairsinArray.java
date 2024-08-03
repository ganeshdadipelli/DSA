public class PairNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        // Loop through the array and print all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("(" + nums[i] + ", " + nums[j] + ")");
            }
        }
    }
}

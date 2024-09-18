class Solution {
    public int maximumDifference(int[] nums) {
        int m = -1;  // Initialize max difference as -1
        // Iterate over the array from the first to the second-last element
        for (int i = 0; i < nums.length - 1; i++) {
            // Compare the current element with every subsequent element
            for (int j = i + 1; j < nums.length; j++) {
                // If a valid pair is found, calculate the difference
                if (nums[j] > nums[i]) {
                    int diff = nums[j] - nums[i];
                    // Update the maximum difference
                    m = Math.max(m, diff);
                }
            }
        }
        return m;
    }
}

public class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Otherwise, the min is in the left half or at mid
            else {
                right = mid;
            }
        }

        // Left points to the minimum element
        return nums[left];
    }
}
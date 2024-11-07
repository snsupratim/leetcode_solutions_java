public class Solution {
public int maxProduct(int[] nums) {
// Edge case: if the array is empty, return 0
if (nums == null || nums.length == 0) {
return 0;
}
    
    // Initialize maxProduct, minProduct, and result with the first element
    int maxProduct = nums[0];
    int minProduct = nums[0];
    int result = nums[0];

    // Iterate through the array starting from the second element
    for (int i = 1; i < nums.length; i++) {
        int current = nums[i];

        // If the current number is negative, swap max and min
        if (current < 0) {
            int temp = maxProduct;
            maxProduct = minProduct;
            minProduct = temp;
        }

        // Update maxProduct and minProduct
        maxProduct = Math.max(current, maxProduct * current);
        minProduct = Math.min(current, minProduct * current);

        // Update result with the maximum product found so far
        result = Math.max(result, maxProduct);
    }

    return result;
}
}
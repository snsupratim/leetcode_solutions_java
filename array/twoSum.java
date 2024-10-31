import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution found (though the problem guarantees exactly one solution)
        throw new IllegalArgumentException("No two sum solution");

    }
}
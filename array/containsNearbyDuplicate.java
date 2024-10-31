import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap to store (number, last_index)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Check if num is already in the map and if the difference between indices is
            // <= k
            if (map.containsKey(num) && i - map.get(num) <= k) {
                return true;
            }
            // Update the index of the current number
            map.put(num, i);
        }

        // No such indices found
        return false;
    }
}

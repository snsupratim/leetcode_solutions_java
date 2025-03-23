public class twosumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Adding 1 because the question asks for 1-based indices
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++; // Move left pointer to get a larger sum
            } else {
                right--; // Move right pointer to get a smaller sum
            }
        }

        // The problem guarantees that there is one solution,
        // so we don't need to handle cases where there's no answer.
        return new int[] { -1, -1 }; // This line will never be reached
    }
}
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

import java.util.Arrays;
public class Tow_Sum {
    // Method to find two indices that sum up to the target
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};  // Return [-1, -1] if no solution is found
    }

    // Main method to test the twoSum function
    public static void main(String[] args) {
        Tow_Sum solution = new Tow_Sum();

        // Test case 1
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));  // Output: [0, 1]

        // Test case 2 (no solution)
        nums = new int[]{1, 2, 3};
        target = 10;
        result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));  // Output: [-1, -1]
    }
}

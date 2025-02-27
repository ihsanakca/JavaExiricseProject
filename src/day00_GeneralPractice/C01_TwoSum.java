package day00_GeneralPractice;

import day14_Methods.C01_MethodsUsing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_TwoSum {
    public static void main(String[] args) {
        int[] nums = {5, 2, 11, 3, 7, 15};
        int target = 9;

        System.out.println("Arrays.toString(twoSum(nums ,target)) = " + Arrays.toString(twoSum(nums, target)));
        System.out.println("Arrays.toString(twoSum_1(nums ,target)) = " + Arrays.toString(twoSum_1(nums, target)));


    }

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
     * to target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * You can return the answer in any order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

//{5, 2, 11, 3, 6, 7, 15};
    public static int[] twoSum_1(int[] nums, int target) {
        Map<Integer,Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null){
                return new int[] {i , complementIndex};
            }
            complements.put(target - nums[i],i);
        }
        return nums;
    }
}

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.

Subscribe to see which companies asked this question
*/

import java.util.*;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] temp = nums.clone();
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int sum = 0;
        int[] result = new int[2];
        while (start != end) {
            sum = nums[start] + nums[end];
            if (sum == target) {
                int count = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (temp[i] == nums[start]) {
                        result[count] = i;
                        count++;
                    } else if (temp[i] == nums[end]) {
                        result[count] = i;
                        count++;
                    }
                    if (count == 2) {
                        return result;
                    }
                }
                return result;
            } else if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] params = {15, 7, 11, 2};
        int[] result = twoSum(params, 9);
        System.out.println(result[0] + " " + result[1]);
    }
}
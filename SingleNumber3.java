/*
Problem 260.

Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*/

import java.util.*;

class SingleNumber3 {

    public static int[] singleNumber(int[] nums) {

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        xor = ((xor & (xor - 1)) ^ xor);
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & xor) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {

        int[] result = singleNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 5, 4, 3, 2, 1});
        for (int num : result) {
            System.out.println(num);
        }
    }
}
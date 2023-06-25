/*----------------------------------------------------------------------
	FILE        : MissingNumberTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 25.06.2023

	https://leetcode.com/problems/missing-number/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.BitManipulation;

import java.util.Arrays;

public class MissingNumberTest {

    public static void run()
    {
        var nums = new int[]{3, 0, 1};

        System.out.printf("Input: nums = %s\n", Arrays.toString(nums));
        System.out.printf("Output: %s\n", missingNumber(nums));
    }

    public static int missingNumber(int[] nums)
    {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= (nums[i] ^ i);
        }
        return result ^ nums.length;
    }
}

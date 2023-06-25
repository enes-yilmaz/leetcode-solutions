/*----------------------------------------------------------------------
	FILE        : SingleNumberTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 25.06.2023

	https://leetcode.com/problems/single-number/

	Tricks:
	    x ^ x = 0

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.BitManipulation;

import java.util.Arrays;

public class SingleNumberTest {

    public static void run()
    {
        var nums = new int[]{4, 1, 2, 1, 2};

        System.out.printf("Input: nums = %s\n", Arrays.toString(nums));
        System.out.printf("Output: %s\n", singleNumber(nums));
    }

    public static int singleNumber(int[] nums)
    {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
}

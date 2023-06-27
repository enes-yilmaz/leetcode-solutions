/*----------------------------------------------------------------------
	FILE        : TwoSumII.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 27.06.2023

	https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.TwoPointers;

import java.util.Arrays;

public class TwoSumIITest {

    public static void run()
    {
        var numbers = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.printf("Input: numbers = %s, target = %s\n", Arrays.toString(numbers), target);
        System.out.printf("Output: %s\n", Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target)
    {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target)
                return new int[]{left + 1, right + 1};

            if (numbers[left] + numbers[right] < target)
                left++;
            else
                right--;
        }

        return null;
    }
}

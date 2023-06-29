/*----------------------------------------------------------------------
	FILE        : ContainerWithMostWaterTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 29.06.2023

	https://leetcode.com/problems/container-with-most-water/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.TwoPointers;

import java.util.Arrays;

public class ContainerWithMostWaterTest {

    public static void run()
    {
        var height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.printf("Input: height = %s\n", Arrays.toString(height));
        System.out.printf("Output: %s\n", maxArea(height));
    }

    public static int maxArea(int[] height)
    {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            result = Math.max(result, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return result;
    }
}

/*----------------------------------------------------------------------
	FILE        : ThreeSumTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 27.06.2023

	https://leetcode.com/problems/3sum/

	Tricks:
	    a + b + c = 0
	        b + c = -a (twoSum in sorted array)

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSumTest {

    public static void run()
    {
        var nums = new int[]{-1, 0, 1, 2, -1, -4};

        System.out.printf("Input: nums = %s\n", Arrays.toString(nums));
        System.out.printf("Output: %s\n", threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        var solution = new LinkedList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                ArrayList<Integer> subList = new ArrayList<>();
                if (nums[left] + nums[right] == target) {
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    solution.add(subList);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                }
                if (nums[left] + nums[right] < target)
                    left++;
                else
                    right--;
            }
        }
        return solution;
    }
}

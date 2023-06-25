/*----------------------------------------------------------------------
	FILE        : BitCountsTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 25.06.2023

	https://leetcode.com/problems/counting-bits/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.BitManipulation;

import java.util.Arrays;

public class BitCountsTest {

    public static void run()
    {
        int n = 2;

        System.out.printf("Input: n = %s\n", n);
        System.out.printf("Output: %s\n", Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n)
    {
        var ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = hammingWeight(i);
        }
        return ans;
    }

    private static int hammingWeight(int n)
    {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) != 0)
                count++;
            n >>= 1;
        }
        return count;
    }
}

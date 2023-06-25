/*----------------------------------------------------------------------
	FILE        : NumberOfOneBitsTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 25.06.2023

	https://leetcode.com/problems/number-of-1-bits/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.BitManipulation;

public class NumberOfOneBitsTest {

    public static void run()
    {
        int n = 11;
        System.out.printf("Input: %s\n", String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.printf("Output: %s", hammingWeight(n));
    }

    public static int hammingWeight(int n)
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

/*----------------------------------------------------------------------
	FILE        : ReverseBitsTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 25.06.2023

	https://leetcode.com/problems/reverse-bits/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.BitManipulation;

public class ReverseBitsTest {

    public static void run()
    {
        int n = 43261596;

        System.out.printf("Input: n = %s (%s)\n", n, String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.printf("Output: %s (%s)\n", reverseBits(n), String.format("%32s", Integer.toBinaryString(reverseBits(n))).replace(' ', '0'));
    }

    public static int reverseBits(int n)
    {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            res = res | bit << (31 - i);
        }
        return res;
    }
}

/*----------------------------------------------------------------------
	FILE        : ReverseIntegerTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 26.06.2023

	https://leetcode.com/problems/reverse-integer/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.BitManipulation;

import java.util.Arrays;

public class ReverseIntegerTest {

    public static void run()
    {
        int x = 123;
        System.out.printf("Input: x = %s\n", x);
        System.out.printf("Output: %s\n", reverse(x));

        System.out.println();

        int y = -123;
        System.out.printf("Input: x = %s\n", y);
        System.out.printf("Output: %s\n", reverse(y));
    }

    public static int reverse(int x)
    {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int reversed = 0;

        while (x != 0) {
            if (reversed > Integer.MAX_VALUE / 10)
                return 0;

            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return isNegative ? -reversed : reversed;
    }
}

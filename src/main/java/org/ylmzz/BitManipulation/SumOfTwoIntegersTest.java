/*----------------------------------------------------------------------
	FILE        : SumOfTwoIntegersTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 25.06.2023

	https://leetcode.com/problems/sum-of-two-integers/

	Tricks:
	    a ^ b -> to sum
	    a & b << 1 -> to carry

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.BitManipulation;

public class SumOfTwoIntegersTest {

    public static void run()
    {
        int a = 2;
        int b = 3;

        System.out.printf("Input: a = %d, b = %d\n", a, b);
        System.out.printf("Output: %d\n", getSum(a, b));
    }

    public static int getSum(int a, int b)
    {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}

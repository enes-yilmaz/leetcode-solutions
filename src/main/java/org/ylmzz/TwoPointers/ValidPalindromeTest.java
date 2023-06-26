/*----------------------------------------------------------------------
	FILE        : ValidPalindromeTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 26.06.2023

	https://leetcode.com/problems/valid-palindrome/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.TwoPointers;

public class ValidPalindromeTest {

    public static void run()
    {
        String s = "A man, a plan, a canal: Panama";

        System.out.printf("Input: s = %s\n", s);
        System.out.printf("Output: %s\n", isPalindrome(s));
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            char cLeft = Character.toLowerCase(s.charAt(left));
            if (!Character.isLetter(cLeft)){
                left++;
                continue;
            }

            char cRight = Character.toLowerCase(s.charAt(right));
            if (!Character.isLetter(cRight)){
                right--;
                continue;
            }

            if (cLeft != cRight)
                return false;
            left++;
            right--;
        }
        return true;
    }
}

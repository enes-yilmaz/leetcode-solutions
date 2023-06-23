/*----------------------------------------------------------------------
	FILE        : ValidAnagramTest.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 23.06.2023

	https://leetcode.com/problems/valid-anagram/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.ArraysAndHashing;

public class ValidAnagramTest {

    public static void run()
    {
        String s = "anagram";
        String t = "nagaram";

        System.out.printf("Input: s = %s, t = %s\n", s, t);
        System.out.printf("Output: %b\n", isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length()) return false;

        var counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int c : counts) if (c != 0) return false;

        return true;
    }
}

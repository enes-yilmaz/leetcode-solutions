/*----------------------------------------------------------------------
	FILE        : GroupAnagrams.java
	AUTHOR      : enes-yilmaz
	LAST UPDATE : 23.06.2023

	https://leetcode.com/problems/group-anagrams/

	All Rights Free
-----------------------------------------------------------------------*/
package org.ylmzz.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsTest {

    public static void run()
    {

        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.printf("Input: strs = %s\n", Arrays.toString(strs));
        System.out.printf("Output: %s\n", groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> response = new ArrayList<>();
        if (strs.length == 0) return response;

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            var count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            var key = Arrays.toString(count);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(str);
        }

        response.addAll(map.values());
        return response;
    }
}

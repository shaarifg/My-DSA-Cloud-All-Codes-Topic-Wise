package leetcode;

/*
387.
Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.
*/

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        //    String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                //    ans = ans + s.charAt(i);
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }

        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
            System.out.println(map);
            return -1;
    }
}

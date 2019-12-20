package top100;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * serial: 3
 * difficulty: medium
 * @Author: guojun
 * @Date: 2019/12/19
 */
public class TheLongestSubString {

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int left = 0;
        int right = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            Character c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                ans = Math.max(ans, right - left + 1);
                right++;
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}

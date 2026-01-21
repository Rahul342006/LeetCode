//Given a string s, find the length of the longest substring without duplicate characters.
//Example 1:
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3

import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        Set<Character> store = new HashSet<>();
        int ptr1 = 0, ptr2 = 0;
        int max = 0;
        int bestStart = 0;

        while (ptr1 < str.length()) {
            char c = str.charAt(ptr1);

            if (!store.contains(c)) {
                store.add(c);
                ptr1++;

                int currentLength = ptr1 - ptr2;
                if (currentLength > max) {
                    max = currentLength;
                    bestStart = ptr2;
                }
            } else {
                store.remove(str.charAt(ptr2));
                ptr2++;
            }
        }

        String answer = str.substring(bestStart, bestStart + max);
        System.out.println("Length: " + max);
        System.out.println("Substring: " + answer);
    }
}

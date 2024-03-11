/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
 */

 class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        // Find the GCD of lengths
        int gcdLength = gcd(len1, len2);
        
        // Get the potential substring
        String potentialSubstring = str1.substring(0, gcdLength);
        
        // Check if potential substring divides str1 and str2
        if (isDivisor(str1, potentialSubstring) && isDivisor(str2, potentialSubstring)) {
            return potentialSubstring;
        }
        
        return "";
    }
    
    // Function to find GCD
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    // Function to check if a substring divides the string
    private boolean isDivisor(String str, String substring) {
        int len = str.length();
        int subLen = substring.length();
        
        // Check if str is composed of repetitions of substring
        if (len % subLen != 0) {
            return false;
        }
        
        for (int i = 0; i < len; i += subLen) {
            if (!str.substring(i, i + subLen).equals(substring)) {
                return false;
            }
        }
        
        return true;
    }
}
    
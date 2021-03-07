class Solution {
    public boolean isPalindrome(String s) {
        return check(s);
    }

    private static boolean check(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            while (!isAlphanumeric(chars[left])) {
                left++;
                if (left >= chars.length) {
                    break;
                }
            }
            while (!isAlphanumeric(chars[right])) {
                right--;
                if (right < 0) {
                    break;
                }
            }
            if (left > right) {
                return true;
            }
            if (chars[left] != chars[right]) {
                if (isLetter(chars[left]) && isLetter(chars[right])
                        && Math.abs(chars[left] - chars[right]) == 32) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isAlphanumeric(char c) {
        return Character.isLetterOrDigit(c);
    }

    private static boolean isLetter(char c) {
        return Character.isLetter(c);
    }
        
    }

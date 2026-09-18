class Solution {
   public boolean isPalindrome(String s) {
        String noSpaces = s.replaceAll("\\s+", "").replaceAll("\\p{Punct}", "").toLowerCase();
        char[] chars = noSpaces.toCharArray();
        int lp = 0;
        int rp = chars.length-1;

        while (lp < rp) {
            if (chars[lp] != chars[rp]) {
                return false;
            }

            lp++;
            rp--;
        }

        return true;
    }
}

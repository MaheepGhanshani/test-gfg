class Solution {
    public char getMaxOccuringChar(String s) {
        // code here  
        char maxChar = s.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount|| (count == maxCount && s.charAt(i) < maxChar)) {
                maxCount = count;
                maxChar = s.charAt(i);
            }
        }
        return maxChar;
    }
}
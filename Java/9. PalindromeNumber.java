class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String s = Integer.toString(x);
        String temp = "";
        for (int i = 1; i <= s.length(); i++){
            temp = temp + s.charAt(s.length() - i);
        }
        if(s.equals(temp)){
            isPalindrome = true;
        }
        return isPalindrome;
    }
}

//with strings
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

//with integers
class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        int temp = x;
        int div = 0;
        int dev =0;
        for(int i =0; temp > 0;i++){
            div = temp %10;
            dev = (dev * 10)+ div;
            temp/=10;
        }
        if (dev == x){
            isPalindrome = true;
        }
        return isPalindrome;
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        int length = s.length();
        String word = "";
        for(int i = length - 1; i>=0;i--){
            char c = s.charAt(i);
            if(word.length() > 0 && c == ' '){
                break;
            }
            else if(c == ' ' && word.length() == 0){
                continue;
            }
            else if(c != ' '){
                word += c;
            }

        }
        lengthOfLastWord = word.length();
        return lengthOfLastWord;
    }
}
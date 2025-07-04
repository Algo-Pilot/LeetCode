class Solution {
    public int romanToInt(String s) {
        int romanToInt = 0;
        for(int i = 1; i <= s.length(); i++){
            int a = s.charAt(i-1);
            int b = 0;
            if( i != s.length()){
                b = s.charAt(i);
            }
            if(a == 73){
                if(b == 86){
                    romanToInt += 4;
                    i++;
                }
                else if(b == 88){
                    romanToInt += 9;
                    i++;
                }
                else{
                    romanToInt += 1;
                }
            }
            else if (a == 86){
                romanToInt += 5;
            }
            else if (a == 88){
                if(b == 76){
                    romanToInt += 40;
                    i++;
                }
                else if(b == 67){
                    romanToInt += 90;
                    i++;
                }
                else{
                    romanToInt += 10;
                }
            }
            else if (a == 76){
                romanToInt += 50;
            }
            else if (a == 67){
                if(b == 68){
                    romanToInt += 400;
                    i++;
                }
                else if(b == 77){
                    romanToInt += 900;
                    i++;
                }
                else{
                    romanToInt += 100;
                }
            }
            else if ( a == 68){
                romanToInt += 500;
            }
            else if (a == 77){
                romanToInt += 1000;
            }
        }
        return romanToInt;
    }
}

class Solution {
    private int con(char a){
        if(a=='I') return 1;
        if(a=='V') return 5;
        if(a=='X') return 10;
        if(a=='L') return 50;
        if(a=='C') return 100;
        if(a=='D') return 500;
        if(a=='M') return 1000;
        return 0;

    }
    public int romanToInt(String s) {
        int previous = con(s.charAt(0));
        int ans = 0;
        int x =0;
        for(char a:s.toCharArray()){
            x = con(a);
            if(previous<x){
                ans -= previous;
                ans += (x-previous);
                
            }else{
                ans += x;
            }
            previous = x;
        }
        return ans;
    }
}
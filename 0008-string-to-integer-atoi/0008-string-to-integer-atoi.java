class Solution {
    private int con(char a){
        int x = a - '0';
        return x;
    }
    private boolean check(int x){
        if(x>=0&&x<=9) return true;
        return false;
    }
    public int myAtoi(String s) {
        String ss = s.trim();
        boolean neg = false;
        int ans = 0;
        if (ss.length() == 0) return 0;
        if(ss.charAt(0)=='-'|| ss.charAt(0) == '+'){
            if(ss.charAt(0) == '-') neg = true;
            for(int i =1;i<ss.length();i++){
                char a = ss.charAt(i);
                if(check(con(a))){
                    int digit = con(a);
                    if (ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE / 10 &&digit > 7)){
                        return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                    ans *= 10;
                    ans += digit;
                }else{
                    if(neg)return ans*-1;
                    return ans;
                }
            }
        }else{
            for(int i =0;i<ss.length();i++){
                char a = ss.charAt(i);
                if(check(con(a))){
                    int digit = con(a);
                    if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                        return Integer.MAX_VALUE;
                    }
                    ans *= 10;
                    ans += digit;
                }else{
                    return ans;
                }
            }
        }
        if(neg)return ans*-1;
        return ans;
        
    }
}
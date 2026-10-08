class Solution {
    private static boolean check(char a){
        int num = a - '0';
        if(num>=0&&num<10) return true;
        return false;
    }
    public int maxDepth(String s) {
        int n = s.length();
        int depth = 0;
        int max = 0;
        int ans = 0;
        int maxdepth = 0;
        for(int i =0;i<n;i++){
            char a = s.charAt(i);
            if(a=='(') depth++;
            if(a==')') depth--;
            if(check(a)){
                int x = a-'0';
                if(x>max){
                    max = x;
                    ans = depth;
                }
            }
            if(depth > maxdepth) maxdepth = depth;
        }
         return maxdepth;
        //return ans;
    }
}
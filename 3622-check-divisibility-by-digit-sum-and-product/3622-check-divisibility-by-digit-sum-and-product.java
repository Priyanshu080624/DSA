class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum=0;
        int product =1;
        while(x>0){
            int y = x%10;
            sum += y;
            product *= y;
            x = x/10;
        }
        if(n%(sum+product)==0) return true;
        return false;
    }
}
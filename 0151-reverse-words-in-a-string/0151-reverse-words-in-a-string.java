class Solution {
    public String reverseWords(String s) {
        int j = s.length()-1;
        StringBuilder ans = new StringBuilder();
        while(j>=0){
            while(j>=0&&s.charAt(j)==' '){
                j--;
            }
            if(j<0) break;
            int i =j;
            while(j>=0&&s.charAt(j)!=' '){
                j--;
            }
            if(ans.length()!=0){
                ans.append(" ");
            }
            ans.append(s.substring(j+1,i+1));
        }
        return ans.toString();
    }
}
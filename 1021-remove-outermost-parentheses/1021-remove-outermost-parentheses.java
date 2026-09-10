class Solution {
    public String removeOuterParentheses(String s) {
        
        int count =0;
        StringBuilder ss = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='('){
                if(count != 0){
                    ss.append("(");
                }
                count++;
            }else{
                count--;
                if(count != 0){
                    ss.append(")");
                }

            }
        }
        return ss.toString();
    }
}
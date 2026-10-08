class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 1;
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }
            else{
                depth--;
                if(depth==0){
                    res.append(GetString(s,i,count));
                    count = i+1;
                }
            }
        }
        return res.toString();
    }
    public String GetString(String s, int i,int count){
        StringBuilder ans = new StringBuilder();
        for(int j = count+1;j<i;j++){
            ans.append(s.charAt(j));
        }
        return ans.toString();
    }
}
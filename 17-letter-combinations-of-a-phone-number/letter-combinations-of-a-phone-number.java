class Solution {
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public void StringBuild(List<String> ans,String digits,String current,int index){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        String s = map[digits.charAt(index) - '0'];
        for(int i = 0;i<s.length();i++){
            StringBuild(ans,digits,current+s.charAt(i),index+1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0)return ans;
        StringBuild(ans,digits,"",0);
        return ans;
    }
}
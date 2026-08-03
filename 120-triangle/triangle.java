class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] fut = new int[n];
        int[] cur = new int[n];
        for(int j = 0;j<n;j++){
            fut[j]=triangle.get(n-1).get(j);
        }
        for(int i = n-2;i>=0;i--){
            for(int j = i;j>=0;j--){
                int up = triangle.get(i).get(j)+fut[j];
                int down = triangle.get(i).get(j)+fut[j+1];
                cur[j] = Math.min(up,down);
            }
            fut = cur.clone();
        }
        return fut[0];

    }
}
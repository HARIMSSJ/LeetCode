class Solution {
    public List<List<Integer>> generate(int numRows) {
        int r=numRows;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> frow=new ArrayList<>();
        frow.add(1);
        ans.add(frow);
        for(int i=1;i<r;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                int add=ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                row.add(add);
            }
            row.add(1);
            ans.add(row);

        }
        return ans;
        
    }
}
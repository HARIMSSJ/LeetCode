class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i: nums){
            if(hs.containsKey(i)){
                ans=ans+hs.get(i);
                hs.put(i,hs.get(i)+1);
            }
            else{
                hs.put(i,1);
            }
        }
        return ans;
        
    }
}
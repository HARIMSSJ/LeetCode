class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int val : hs.keySet()){
            if( ans<hs.get(val)){
                ans=hs.get(val);
                max=val;
            }

        }
      return max;  
    }
}
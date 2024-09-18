class Solution {
    public int maximumDifference(int[] nums) {
       int max=-1;
       int n=nums.length-1;
       int lmin=nums[0];
       for (int i=0;i<=n;i++){
        int val=nums[i];
        if (lmin<val){
            max=Math.max(max,val-lmin);
        }
        lmin=Math.min(lmin,val);
       }
    return max;
    }
}

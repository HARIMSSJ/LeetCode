class Solution {
    public int[] findErrorNums(int[] nums) {
        int []arr={0,0};
        HashSet<Integer> hs=new HashSet<>();
        for(int i: nums){
            if(!hs.contains(i)){
                hs.add(i);
            }
            else{
                arr[0]=i;
            }
        }
        for(int j=1;j<=nums.length;j++){
            if(!hs.contains(j)){
                arr[1]=j;
            }
        }
        return arr;
    }
}
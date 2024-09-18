class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length-1;
        int max=arr[arr.length-1];
        int val=0;
        for (int i=arr.length-1;i>=0;i--){
            if (i == len){
                 val=arr[i];
                arr[i]= -1;
                continue;
            }
            

            
            max=Math.max(max,val);
            val=arr[i];

            arr[i]=max;
            
        }
        return arr;
    }
}
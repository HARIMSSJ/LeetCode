class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        int n=colors.length-1;
        for (int i=0;i<n;i++){
            if (colors[i]!=colors[n]){
                max=Math.max(max,n-i);
                break;
            }
        }
        for (int i=n;i>0;i--){
            if (colors[i]!=colors[n]){
                max=Math.max(max,i);
                break;
            }

        }

       return max; 
    }
}
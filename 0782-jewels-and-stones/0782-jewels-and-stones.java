class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int j=0;
        for(Character i : stones.toCharArray()){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(Character s : jewels.toCharArray()){
            if (hs.containsKey(s)){
                j=j+hs.getOrDefault(s,0);
            }
        }
        return j;
    }
}
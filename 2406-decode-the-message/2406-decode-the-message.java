class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hs=new HashMap<>();
        StringBuilder st=new StringBuilder();
        char c='a';
        for(char s : key.toCharArray()){
            if(s!=' ' && !hs.containsKey(s)){
                hs.put(s,c);
                c++;
            }
            
        }
        for(char m: message.toCharArray()){
            if (m ==' '){
                st.append(" ");
            }
            else{
                st.append(hs.get(m));
            }

        }

        return st.toString();
        
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> h =new HashMap<>();
        HashMap<Character,Integer> h2 =new HashMap<>();
        for(int i =0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            h2.put(t.charAt(i),h2.getOrDefault(t.charAt(i),0)+1);
        }
        return h.equals(h2);


       


    }
}

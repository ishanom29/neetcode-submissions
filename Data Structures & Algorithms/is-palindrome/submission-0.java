class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                s1.append(Character.toLowerCase(c));
            }
        }
        return s1.toString().equals(s1.reverse().toString());
        
    }

}

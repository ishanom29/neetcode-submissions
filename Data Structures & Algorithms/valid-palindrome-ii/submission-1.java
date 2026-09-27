class Solution {
    public boolean checkpalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        
    }
    return true;

    }
    public boolean validPalindrome(String s) {
        if (checkpalindrome(s))
            return true;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;}
            else
                return checkpalindrome(s.substring(i+1,j+1)) || checkpalindrome(s.substring(i,j));
        }
        return true;

    }}
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
        String g ="";
        if(checkpalindrome(s))
         return true;
         for(int i=0;i<s.length();i++){
            if(i>0)
            g= s.substring(0,i) + s.substring(i+1,s.length());
            else
                g= s.substring(1,s.length());

        if(checkpalindrome(g))
         return true;

         }
         return false;
    }
}
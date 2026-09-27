class Solution {
    public boolean isValid(String s) {
        char stack []= new char[s.length()];
        int top=-1;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='('|| s.charAt(i)=='{')
            stack[++top]=s.charAt(i);
        
            else if (s.charAt(i)==']' || s.charAt(i)==')'|| s.charAt(i)=='}')
            {if (top==-1) return false;
             if ((s.charAt(i)==']' && stack[top]!='[') ||
                    (s.charAt(i)==')' && stack[top]!='(') ||
                    (s.charAt(i)=='}' && stack[top]!='{'))
                    return false;
                    top--;}

            
        }
        return (top==-1);
        
    }
}

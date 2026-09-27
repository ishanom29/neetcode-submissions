class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        top = -1
        for i in range(len(s)):
            if s[i]=='(' or s[i]=='{' or s[i]=='[':
                top= top+1;
                st.append(s[i])
            elif s[i]==')' or s[i]=='}' or s[i]==']':
                if not st:
                    return False
                if (s[i]==')' and st[top]!='(') or (s[i]==']' and st[top]!='[') or (s[i]=='}' and st[top]!='{'):
                    return False;
                top = top -1;
                st.pop();

        return top==-1

            
                
                
                

                



        
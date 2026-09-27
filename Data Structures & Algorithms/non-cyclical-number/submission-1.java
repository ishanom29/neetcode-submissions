class Solution {
    public int findsquaredigit(int n){
        int s=0;
        while(n!=0){
            int x= n%10;
            s = s + x*x;
            n= n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> h =new HashSet<>();
        while(h.contains(n)!=true){
            
            if(n==1)
            return true;
            h.add(n);
            n=findsquaredigit(n);
        }
        return false;

    }
}

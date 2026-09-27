class Solution {
    public int[] countBits(int n) {
        int c;
        int res[]=new int[n+1];
        res[0]=0;
    for(int i=1;i<=n;i++){
        c=0;
        int n1=i;
        while(n1!=0){
         c++;
         n1= (n1)&(n1-1);
        }
        res[i]=c;
    }
    return res;
    }
    
}

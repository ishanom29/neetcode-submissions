class Solution {
    public double myPow(double x, int n) {
        double res=1.0;
        if(n<Integer.MIN_VALUE)
        return 0;
        if(n<0)
        {x=1/x;}
       long n1 = (long)Math.abs(n);

    while(n1>0){
        if(n1%2!=0)
        res=res*x;
        x=x*x;
        n1=n1>>>1;
    }
    return res;
}
}
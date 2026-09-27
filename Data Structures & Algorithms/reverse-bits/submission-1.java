class Solution {
    public int reverseBits(int n) {
        int res []=new int[32];
        for(int i=0;i<32;i++){
            res[i] = (n&1);
            n=n>>>1;
        }
        System.out.println(Arrays.toString(res));
        int s=0;
        for(int i=31;i>=0;i--){
            s=s+(res[31-i]<<i);

        }
        System.out.println(Integer.toUnsignedLong(s));
        return s;
    }
}

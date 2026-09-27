class Solution {
       public int minimumRecolors(String blocks, int k) {
        int l=0;
        int c=0;
        for(int i =0;i<k;i++){
            if(blocks.charAt(i)=='W')
            c++;
        
        }
        int res= c;
    for(int i=k;i<blocks.length();i++){
                if(blocks.charAt(l)=='W')
            c--;
        
        
        l++;
        if(blocks.charAt(i)=='W')
            c++;
        

        res= Math.min(res,c);
    }

    return res;
        
    }
}
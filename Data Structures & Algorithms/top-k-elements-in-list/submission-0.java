class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i:nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        List<Integer> [] fq= new List[nums.length+1];
        for(int i=0;i<nums.length+1;i++){
            fq[i]= new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer>m:hmap.entrySet()){
            fq[m.getValue()].add(m.getKey());
        }
        int res []=new int[k];
        int index=0;
        for(int i=fq.length-1 ;i>0;i--){
            if(index==k)
                return res;
            for(int n:fq[i]){
                res[index++]=n;
                
            }
            }
        return res;
    }
}

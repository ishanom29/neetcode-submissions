class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i]))
            {   int j= h.get(arr[i]);
                    if(Math.abs(i-j)<=k)
                    return true;
            }
            h.put(arr[i],i);
        }
        return false;
    }
}
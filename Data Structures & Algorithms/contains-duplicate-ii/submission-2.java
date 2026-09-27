class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int l=0;
        HashSet<Integer>h =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if (i-l>k)
            {h.remove(arr[l]);
            l++;
            }
            if(h.contains(arr[i]))
            return true;
            h.add(arr[i]);
        }
    
    return false;
}}
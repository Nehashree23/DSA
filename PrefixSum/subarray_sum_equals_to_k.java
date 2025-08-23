class Solution {
    public int subarraySum(int[] nums, int k) {
       int  prefixsum=0;
       int count=0;
       HashMap<Integer,Integer> ps=new HashMap<>();
       ps.put(0,1);
       for(int ele:nums){
        prefixsum+=ele;
        if(ps.containsKey(prefixsum-k)){
            count+=ps.get(prefixsum-k);
        }
        ps.put(prefixsum,ps.getOrDefault(prefixsum,0)+1);
       }
       return count;
    }
}
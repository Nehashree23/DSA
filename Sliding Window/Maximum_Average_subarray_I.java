class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxavg=(double)sum/k;
        for(int i=k;i<nums.length;i++){
         sum+=nums[i];
         sum-=nums[i-k];
         double avg=(double)sum/k;
         maxavg=Math.max(maxavg,avg);
        }
        return maxavg;
    }
}
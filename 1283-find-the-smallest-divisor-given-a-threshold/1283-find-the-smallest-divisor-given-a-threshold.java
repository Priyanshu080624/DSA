class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high = nums[0];
        for(int i =0;i<nums.length;i++){
            if(high<nums[i]) high = nums[i];
        }
        int low = 1;
        while(low<high){
            int mid = low + (high -low)/2;
            int sum =0;
            for(int i =0;i<nums.length;i++){
                sum += (nums[i] + mid - 1) / mid;
            }
            //if(sum==threshold) return mid;
            if(sum > threshold) low = mid+1;
            else high = mid ;
        }
        return low;
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(mid ==0){
                return nums[mid];
            }
            if(mid==nums.length-1){
                return nums[nums.length-1];
            }
            if(nums[mid+1]==nums[mid]){
                if(mid%2==0){
                    low = mid +1;
                }else high = mid-1;
            }
            else if(nums[mid-1]==nums[mid]){
                if((mid-1)%2==0){
                    low = mid +1;
                }else high = mid-1;
            }
            else return nums[mid];
        }
        return nums[low];
    }
}
class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;
        if(nums.length==1) return nums[0];
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[low]>nums[high]&&nums[mid]<nums[high]||nums[low]<nums[high]&&nums[mid]<nums[high]){
                high = mid;
            }else low = mid+1;
        }
        if(high<0) high =0;
        if(low >nums.length-1) low = nums.length -1;
        if(nums[high]>nums[low]) return nums[low];
        else return nums[high];
    }
}
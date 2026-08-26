class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;
        if(nums.length==1) return nums[0];
        //int r = low + (high-low)/2;
        //if(nums.length>3&&nums[r]<nums[r-1]&&nums[r]<nums[r+1]) return nums[r];
        while(low<=high){
            int mid = low + (high-low)/2;
            //if(mid-1>=0&&mid+1<nums.length&&nums.length>3&&nums[mid]<nums[mid-1]&&nums[mid]<nums[mid+1]) return nums[mid];
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
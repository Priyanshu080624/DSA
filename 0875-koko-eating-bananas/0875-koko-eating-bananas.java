class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = piles.length;
        int high = piles[0];
        for(int i =0;i<k;i++){
            if(piles[i]>high) high = piles[i];
        }
        int low = 1;
        while(low<=high){
            int mid = low+(high -low)/2;
            long hour=0;
            for(int i =0;i<k;i++){
                hour += (piles[i] + mid - 1) / mid;
            }
            if(hour>h) low = mid+1;
            else high = mid -1;
        }
        return low;
    }
}
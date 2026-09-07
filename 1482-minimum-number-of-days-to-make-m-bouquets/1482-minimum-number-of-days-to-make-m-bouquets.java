class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int low=bloomDay[0];
        int high = bloomDay[0];
        for(int i =0;i<bloomDay.length;i++){
            if(bloomDay[i]<low) low = bloomDay[i];
            if(bloomDay[i]>high) high = bloomDay[i];
        }
        //System.out.print(low+" "+high);
        while(low<high){
            int mid = low + (high-low)/2;
            int l =0;
            int o = m;
            for(int i = 0;i<bloomDay.length;i++){
                if(l>=k){
                    o--;
                    l=0;
                }
                if(bloomDay[i]<=mid){
                    l++;
                }else l=0;
            }
            
            if(l>=k) o--;
            //System.out.print(o+"\n");
            if(o<=0) high = mid;
            else low = mid+1;
        }
        return low;
    }
}
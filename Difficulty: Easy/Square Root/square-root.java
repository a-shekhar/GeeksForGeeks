class Solution {
    int floorSqrt(int n) {
         int low = 1;
        int high = n; 
        int mid;
        long pro;

        while(low <= high){
            mid = low + (high - low) / 2;
            pro = mid * mid;
            if(pro == n){
                return mid;
            } else if (pro > n){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }
}
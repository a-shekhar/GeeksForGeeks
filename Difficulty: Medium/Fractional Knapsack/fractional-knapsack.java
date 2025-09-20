class Solution {
    
    private static double  ratio(int v, int w){
        return (double) v/w;
    }
    
    
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
       double maxval = 0;

        int n = val.length;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = wt[i];
            arr[i][1] = val[i];
        }

        Arrays.sort(arr, (a, b) -> Double.compare(ratio(b[1], b[0]),  ratio(a[1], a[0])));  // sort DESC by value/weight
        //System.out.println(Arrays.deepToString(arr));

        for(int[] tempArr: arr){
           if(capacity >= 0){
             int maxWeight = Math.min(tempArr[0], capacity);
             maxval +=  (ratio(tempArr[1], tempArr[0]) * maxWeight);
             capacity -= maxWeight;
             //System.out.println(maxval + " " + capacity);
           }
        }
        //System.out.println(maxval);
        return maxval;
        
    }
}
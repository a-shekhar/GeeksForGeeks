class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
               ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(row -> row[0]));
        int startT = arr[0][0];
        int endT = arr[0][1];
        boolean overlapped = true;
        for(int i = 1; i < arr.length; i++){ 
            if(arr[i][0] <= endT){
                endT = Math.max(arr[i][1], endT);
            } else {
                result.add(new int[]{startT, endT});
                startT = arr[i][0];
                endT = Math.max(arr[i][1], endT);
            }
        }
        result.add(new int[]{startT, endT}); // for last interval
        return result;
    }
}
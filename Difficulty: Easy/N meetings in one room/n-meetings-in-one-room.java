class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        int maxMeetings = 0;

        int[][] arr = new int[start.length][2];

        for(int i = 0; i < start.length; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        //System.out.println(Arrays.deepToString(arr));

        maxMeetings = 1;
        int endT = arr[0][1];

        for(int i = 0;  i < arr.length; i++){
            if(arr[i][0] > endT){
                maxMeetings++;
                endT = arr[i][1];
            }
        }

        return maxMeetings;
    }
}

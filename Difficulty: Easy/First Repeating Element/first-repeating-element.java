class Solution {
    public static int firstRepeated(int[] arr) {
         Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(arr[i]))
                list = map.get(arr[i]);
            list.add(i+1);
            map.put(arr[i], list);
        }
        
        int minIndex = arr.length;
        for(List<Integer> list : map.values()){
            if(list.size() > 1){
                minIndex = Math.min(minIndex, list.get(0));
            }
        }
        return minIndex == arr.length ? - 1 : minIndex;
    }
}

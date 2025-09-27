
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        return (int) arr.parallelStream().filter(num -> num <= x).count();
        
    }
}
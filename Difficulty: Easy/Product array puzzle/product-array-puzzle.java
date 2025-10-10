// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int pro = 1;
        int[] prefixPro = new int[n];
        int[] suffixPro = new int[n];
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++){
            pro *= arr[i];
            prefixPro[i] = pro;
        }

        pro = 1;
        for(int i = n-1; i >= 0; i--){
            pro *= arr[i];
            suffixPro[i] = pro;
        }
        
        result[0] = suffixPro[1];
        for(int i = 1; i < n - 1; i++){
            result[i] =  prefixPro[i-1] * suffixPro[i+1];
        }
        result[n-1] = prefixPro[n-2];
        return  result;
    }
}

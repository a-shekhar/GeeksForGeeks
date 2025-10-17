class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == word.charAt(0)){
                    if(findWord(i, j, n, m, mat, word, 0)){
                        return true;
                    }
                }
            }
        }

        
        return false;
    }

    private boolean findWord(int i, int j, int n, int  m, char[][] mat, String word, int index){
        
        if(index >= word.length()){
            return true;
        }
        
        if(i < 0 || i >= n || j < 0 || j >= m || mat[i][j] == '$' || mat[i][j] != word.charAt(index)){
            return false;
        }

        

        char ch = mat[i][j]; 
        mat[i][j] = '$'; // temp change so we don't count it again and again

        boolean a = findWord(i +  1, j, n, m, mat, word, index + 1);
        boolean b = findWord(i -  1, j, n, m, mat, word, index + 1);
        boolean c = findWord(i, j + 1, n, m, mat, word, index + 1);
        boolean d = findWord(i, j - 1, n, m, mat, word, index + 1);

        // change back to oriiginal after traversing
        mat[i][j] = ch;

        return a || b || c || d;
    }
}
class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1){
                    int k = 0;
                    int l = 0;
                    int ones = 0;

                    while(k < n){
                        if(mat[k][j] == 1){
                            ones++;
                        }
                        k++;
                    }

                    while(l < m){
                        if(mat[i][l] == 1){
                            ones++;
                        }
                        l++;
                    }

                    if(ones - 1 == 1){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
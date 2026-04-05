class Solution {
    public boolean judgeCircle(String moves) {
        int left = 0, right = 0, up = 0, down = 0;
        for(char ch: moves.toCharArray()){
            if(ch == 'U'){
                up++;
            }
            else if(ch == 'L'){
                left++;
            }
            else if(ch == 'R'){
                right++;
            }
            else{
                down++;
            }
        }
        return left == right && up == down;
    }
}
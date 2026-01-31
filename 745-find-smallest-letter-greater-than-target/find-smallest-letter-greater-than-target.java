class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for(char ch: letters){
            if(ch > target){
                pq.add(ch);
            }
        }
        if (pq.isEmpty()) {
            return letters[0];
        }
        return pq.poll();
    } 
}
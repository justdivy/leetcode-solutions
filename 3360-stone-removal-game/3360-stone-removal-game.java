class Solution {
    public boolean canAliceWin(int n) {
        int stones = n;
        int turn = 10;

        while(stones >= turn){
            stones -= turn;
            turn--;
        }
        return turn % 2 == 1;
    }
}
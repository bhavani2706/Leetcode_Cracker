// Last updated: 09/07/2026, 09:46:12
class Solution {
    public int passThePillow(int n, int time) {
        int turn=((n-1)*2);
        time%=turn;
        if(time<n) return time+1;
        return (turn-time+1);
    }
}
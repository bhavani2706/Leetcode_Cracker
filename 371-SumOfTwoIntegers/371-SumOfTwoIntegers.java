// Last updated: 09/07/2026, 10:03:04
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; 
            a = a ^ b;               
            b = carry;                
        }
        return a;
    }
}

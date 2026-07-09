// Last updated: 09/07/2026, 10:02:09
class Solution {
    public int fib(int n) {
    if (n<=1) {
            return n;
        }
        int a=0;
        int b=1;
   for (int i=2;i<=n;i++) {
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
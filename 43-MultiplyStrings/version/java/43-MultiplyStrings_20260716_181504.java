// Last updated: 16/07/2026, 18:15:04
1import java.math.BigInteger;
2class Solution {
3    public String multiply(String num1, String num2) {
4        BigInteger one=new BigInteger(num1);
5        BigInteger two=new BigInteger(num2);
6        return one.multiply(two).toString();
7    }
8}
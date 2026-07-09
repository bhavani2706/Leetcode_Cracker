// Last updated: 09/07/2026, 09:49:44
class Solution {
    public int reverseBits(int n) {

        String binary = "";
        String rev = "";

        while(n > 0) {

            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        while(binary.length() < 32) {
            binary = "0" + binary;
        }

        for(int i = binary.length() - 1; i >= 0; i--) {

            rev += binary.charAt(i);
        }

        int decimal = 0;
        int power = 0;

        for(int i = rev.length() - 1; i >= 0; i--) {

            int digit = rev.charAt(i) - '0';

            decimal = decimal + digit * (int)Math.pow(2, power);

            power++;
        }

        return decimal;
    }
}
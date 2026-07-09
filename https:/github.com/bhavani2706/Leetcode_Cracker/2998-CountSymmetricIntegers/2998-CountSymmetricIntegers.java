// Last updated: 09/07/2026, 09:46:08
class Solution {
    public int countSymmetricIntegers(int low, int high) {
int count = 0;
        for(int i = low; i <= high; i++) {

            String num = String.valueOf(i);

            if(num.length() % 2 != 0) {
                continue;
            }

            int mid = num.length() / 2;

            int leftsum = 0;
            int rightsum = 0;

            for(int j = 0; j < mid; j++) {

                leftsum += num.charAt(j) - '0';
            }

            for(int j = mid; j < num.length(); j++) {

                rightsum += num.charAt(j) - '0';
            }

            if(leftsum == rightsum) {

                count++;
            }
        }

        return count;
    }
}
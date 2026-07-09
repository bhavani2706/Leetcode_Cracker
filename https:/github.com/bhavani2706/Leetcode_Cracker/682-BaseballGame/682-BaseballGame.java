// Last updated: 09/07/2026, 09:48:26
import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.equals("C")) {
                list.remove(list.size() - 1);
            } 
            else if (s.equals("D")) {
                int last = list.get(list.size() - 1);
                list.add(2 * last);
            } 
            else if (s.equals("+")) {
                int last=list.get(list.size() - 1);
                int second=list.get(list.size() - 2);
                list.add(last + second);
            } 
            else {
                list.add(Integer.parseInt(s));
            }
        }
        for (int i=0;i<list.size();i++) {
            sum+=list.get(i);
        }
        return sum;
    }
}
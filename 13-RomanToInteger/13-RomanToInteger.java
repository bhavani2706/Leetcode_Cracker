// Last updated: 09/07/2026, 10:05:03
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
       for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
       return result;
    }
 private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
 /*HashMap<Character,Integer>map=new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans= 0;
        int y=0;
        for (int  i = s.length()-1; i >=0; i--) {
            int x = map.get(s.charAt(i));
         if(x>=y)
                ans += x;
             else 
                ans -= y;
                y=x;
            
        }
        return ans;
    }
}
*/
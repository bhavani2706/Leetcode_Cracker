// Last updated: 09/07/2026, 10:05:04
  class Solution{
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {
            "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
        };

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
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
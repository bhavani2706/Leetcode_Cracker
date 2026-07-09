// Last updated: 09/07/2026, 09:46:11
class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer,Long> m=new TreeMap<>();
        for(int c:basket1)
        m.put(c,m.getOrDefault(c,0L)+1);
        for(int c:basket2)
        m.put(c,m.getOrDefault(c,0L)-1);
        long swaps=0,res=0;
        for(Map.Entry<Integer,Long>entry:m.entrySet()){
            long cnt=entry.getValue();
            if(cnt%2!=0)
            return -1;
            swaps+=Math.max(0,cnt/2);
        }
        int minValue=m.keySet().iterator().next();
        for(Map.Entry<Integer,Long>entry:m.entrySet()){
            int c=entry.getKey();
            long cnt=entry.getValue();
            long take=Math.min(swaps,Math.abs(cnt)/2);
            res+=take*Math.min(c,minValue*2);
            swaps-=take;
        }
        return res;
    }
}
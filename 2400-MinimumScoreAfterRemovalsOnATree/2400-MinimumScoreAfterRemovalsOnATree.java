// Last updated: 09/07/2026, 10:00:38
import java.util.*;

public class Solution {
    List<Integer>[] graph;
    int[] xor;
    boolean[][] isChild;

    public int minimumScore(int[] nums, int[][] edges) {
        int n = nums.length;
        graph = new ArrayList[n];
        xor = new int[n];
        isChild = new boolean[n][n];

        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        dfs(0, -1, nums);

        int min = Integer.MAX_VALUE;
        for (int[] e1 : edges) {
            int a = child(e1[0], e1[1]);
            for (int[] e2 : edges) {
                if (Arrays.equals(e1, e2)) continue;
                int b = child(e2[0], e2[1]);
                int x = xor[a], y = xor[b], z;

                if (isChild[a][b]) {
                    x ^= y;
                    z = xor[0] ^ xor[a];
                } else if (isChild[b][a]) {
                    y ^= x;
                    z = xor[0] ^ xor[b];
                } else {
                    z = xor[0] ^ x ^ y;
                }

                int max = Math.max(x, Math.max(y, z));
                int minVal = Math.min(x, Math.min(y, z));
                min = Math.min(min, max - minVal);
            }
        }
        return min;
    }

    void dfs(int node, int parent, int[] nums) {
        xor[node] = nums[node];
        for (int nei : graph[node]) {
            if (nei == parent) continue;
            dfs(nei, node, nums);
            xor[node] ^= xor[nei];
            for (int i = 0; i < nums.length; i++)
                if (isChild[nei][i]) isChild[node][i] = true;
            isChild[node][nei] = true;
        }
    }

    int child(int u, int v) {
        return isChild[u][v] ? v : u;
    }
}

package day15;

import java.util.*;

public class Day15 {

    public int minJumps(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap();
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            int num = arr[i];

            if (!map.containsKey(num)) {
                map.put(num, new ArrayList());
            }


            map.get(num).add(i);

        }

        Queue<Integer> queue = new LinkedList();
        queue.add(0);
        int step =0;
        boolean[] visited = new boolean[arr.length];
        while(!queue.isEmpty()){
            Queue<Integer> curr = new LinkedList();

            while(!queue.isEmpty())
            {
                int node = queue.poll();

                if(node == n-1){
                    return step;
                }
                visited[node] = true;
                for(int i : map.get(arr[node])){

                    if(!visited[i]){
                        visited[i] = true;
                        curr.add(i);
                    }

                }
                map.get(arr[node]).clear();
                if (node + 1 < n && !visited[node + 1]) {
                    visited[node + 1] = true;
                    curr.add(node + 1);
                }
                if (node - 1 >= 0 && !visited[node - 1] ) {
                    visited[node - 1] = true;
                    curr.add(node - 1);
                }

            }
            step++;
            queue = curr;

        }
        return -1;
    }

}

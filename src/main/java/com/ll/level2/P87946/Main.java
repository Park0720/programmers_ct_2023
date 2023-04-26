package com.ll.level2.P87946;

public class Main {
}

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        for (int[] dungeon : dungeons) {
            if (dungeon[0] <= k) {
                k -= dungeon[1];
                answer++;
            }
        }
        return answer;
    }
}

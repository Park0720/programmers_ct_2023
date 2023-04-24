package com.ll.level2.P42860;

public class Main {
}

class Solution {
    public static boolean isDebug = false;

    public int solution(String name) {
        return nameCost(name) + moveCost(name);
    }

    private int nameCost(String name) {
        int nameCost = 0; // 문자 바꾸는데 드는 비용, 즉 위/아래
        int diff;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            diff = Math.min(26 - (c - 'A'), c - 'A');

            nameCost += diff;

        }
        return nameCost;
    }

    private int moveCost(String name) {
        int moveCost = 0; // 위치 바꾸는데 드는 비용, 즉 좌/우
        int diff;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            diff = Math.min(26 - (c - 'A'), c - 'A');

            if (diff > 0) {
                moveCost = i;
            }
        }
        return moveCost;
    }
}
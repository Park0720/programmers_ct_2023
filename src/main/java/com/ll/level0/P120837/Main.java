package com.ll.level0.P120837;

public class Main {
}

class Solution {
    public int solution(int hp) {
        int general = 0;
        int soldier = 0;
        int work = 0;
        general = hp/5;
        soldier = (hp%5)/3;
        work = (hp%5)%3;
        return general+soldier+work;
    }
}
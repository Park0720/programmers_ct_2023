package com.ll.level0.P120812;

public class Main {
}

class Solution{
    public int solution(int[] array){
        int answer = 1;
        for(int i=0; i<array.length-1;i++){
            if(array[i]==array[i+1]) {
                answer++;
            }
        }
        return answer;
    }
}
package com.ll.level0.P120906;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}

class SolutionV2 {
    public int solution(int n) {
        (n + "")  // 123 => "123"
                .chars() // "123" => intStream[49.50.51]
                .map(e -> Character.getNumericValue(e)) // intStream[49, 50, 51] -> intStream[1, 2, 3]
                .sum(); // intStream[1, 2, 3] -> 6
        return 0;
    }
}

class SolutionV3 {
    public int solution(int n) {
        (n + "")  // 123 => "123"
                .chars() // "123" => intStream[49.50.51]
                .map(Character::getNumericValue) //intStream[49, 50, 51] -> intStream[1, 2, 3]
                .sum(); // intStream[1, 2, 3] -> 6
        return 0;
    }
}

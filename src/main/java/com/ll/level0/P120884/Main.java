package com.ll.level0.P120884;

public class Main {
}
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        int coupon = 0;
        int coupon_sub = 0;
        while(chicken>0){
            coupon=chicken+coupon_sub;          //coupon = 1999    199     19
            service=coupon/10;       //service = 199    19      1
            coupon_sub = coupon%10; //coupon_sub = 9 + 9 +     9
            chicken=service;         //chicken = 199    19      1
            answer+=chicken;         //answer = 199 +   19 +    1
        }
        if (coupon_sub>=10){
            answer+=coupon_sub/10;
        }
        return answer;
    }
}
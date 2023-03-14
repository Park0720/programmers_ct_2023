package com.ll.level0.P120884;

import com.ll.level0.P120884.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("100일 때 결과 11")
    void t1(){
        assertThat(new com.ll.level0.P120884.Solution().solution(100)).isEqualTo(11);
    }
    @Test
    @DisplayName("1081일 때 결과 120")
    void t2(){
        assertThat(new com.ll.level0.P120884.Solution().solution(1081)).isEqualTo(120);
    }
    @Test
    @DisplayName("1999일 때 결과 222")
    void t3(){
        assertThat(new com.ll.level0.P120884.Solution().solution(1999)).isEqualTo(222);
    }
}
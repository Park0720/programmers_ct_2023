package com.ll.level0.P120812;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("[1,2,3,3,3,4]일 때 결과 3")
    void t1(){
        assertThat(new Solution().solution(new int[] {1, 2, 3, 3, 3, 4})).isEqualTo(3);
    }
    @Test
    @DisplayName("[1,1,2,2]일 때 결과 -1")
    void t2(){
        assertThat(new Solution().solution(new int[] {1, 1, 2, 2})).isEqualTo(-1);
    }
    @Test
    @DisplayName("[1]일 때 결과 1")
    void t3(){
        assertThat(new Solution().solution(new int[] {1})).isEqualTo(1);
    }
}

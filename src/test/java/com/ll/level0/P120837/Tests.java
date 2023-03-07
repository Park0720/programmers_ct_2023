package com.ll.level0.P120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("hp가 23이면 결과는 5")
    void t1(){
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }
    @Test
    @DisplayName("hp가 24이면 결과는 6")
    void t2(){
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }
    @Test
    @DisplayName("hp가 999이면 결과는 201")
    void t3(){
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }
}

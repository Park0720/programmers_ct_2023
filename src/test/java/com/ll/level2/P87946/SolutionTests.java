package com.ll.level2.P87946;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTests {
    @Test
    @DisplayName("[[80, 20],[50, 40], [30, 10]], → 3")
    void t1() {
        assertThat(
                new Solution().solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}})
        ).isEqualTo(3);
    }
    @Test
    @DisplayName("[[80, 20]], → 1")
    void t2() {
        assertThat(
                new Solution().solution(80, new int[][]{{80, 20}})
        ).isEqualTo(1);
    }
    @Test
    @DisplayName("[[80, 20], [50, 40]], → 2")
    void t3() {
        assertThat(
                new Solution().solution(80, new int[][]{{80, 20}, {50, 40}})
        ).isEqualTo(2);
    }
}
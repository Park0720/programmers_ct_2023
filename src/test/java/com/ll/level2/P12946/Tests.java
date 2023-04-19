package com.ll.level2.P12946;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("n=1일 때 [[1, 3]]")
    void t01(){
        assertThat(new Solution().solution(1)).isEqualTo(new int[][] {{1, 3}});
    }
    @Test
    @DisplayName("n=2일 때 [[1, 2], [1, 3], [2, 3]]")
    void t02(){
        assertThat(new Solution().solution(2)).isEqualTo(new int[][] {{1, 2}, {1, 3}, {2, 3}});
    }
}

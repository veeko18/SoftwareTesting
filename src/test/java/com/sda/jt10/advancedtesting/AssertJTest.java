package com.sda.jt10.advancedtesting;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    public void introduction() {
        List<Integer> numbers = Arrays.asList(12, 15, 45);

        assertThat(numbers).hasSize(3).contains(12);

        assertThat(numbers).allMatch(x -> x > 10).allMatch(x -> x < 50)
                .noneMatch(x -> x < 10);

        assertThat("ABCD").isNotEmpty();
        assertThat("ABCD").startsWith("A");

    }
}

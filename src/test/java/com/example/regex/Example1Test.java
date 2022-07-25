package com.example.regex;

import com.example.regex.Example1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Example1Test {
    @Test
    void testRegexNoteMedium() {
        String word = "9.8 - Robson, 7.1 - Teresa, 4.5 - Armênio, 6.5 - Zulu, 7.7 - Stefania, 7.8 - João, 5.0 - Romeu, 7.2 - Pompilho, 3.1 - Reinaldo, 7.3 - Bernadete, 4.7 - Cinério ";

        var listResult = new Example1().noteMedium(word);
        assertThat(listResult).hasSize(4)
                              .hasSameElementsAs(Arrays.asList("7.7 - Stefania", "7.8 - João", "7.2 - Pompilho", "7.3 - Bernadete"));

    }

    @Test
    void validateUserName() {
        String word = "T021535849";
        assertThat(new Example1().validateUserName(word)).isTrue();
    }

    @Test
    void helloWorldTest() {
        final var world = new Example1().helloWorld();
        final var world1 = new Example1().helloTest();

        assertThat(world).isEqualTo("Hello world");
        assertThat(world1).isEqualTo("Hello world");
    }
}

package eu.codinsanity.learning;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DigitsMirrorTest {
    @ParameterizedTest
    @MethodSource("mirrorInputs")
    void ofTest(int digits, int mirror) {
        assertThat(DigitsMirror.of(digits)).isEqualTo(mirror);
    }

    private static Stream<Arguments> mirrorInputs() {
        return Stream.of(
            Arguments.of(72539, 93527),
            Arguments.of(0, 0),
            Arguments.of(5, 5),
            Arguments.of(123, 321),
            Arguments.of(100, 1));
    }
}

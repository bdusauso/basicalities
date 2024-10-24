package eu.codinsanity.learning;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfDigitsTest {
    @ParameterizedTest
    @MethodSource("testDigits")
    void testByLog(int number, int expectedLength) {
        assertThat(NumberOfDigits.byLog(number)).isEqualTo((byte) expectedLength);
    }

    @ParameterizedTest
    @MethodSource("testDigits")
    void testByDivision(int number, int expectedLength) {
        assertThat(NumberOfDigits.byDivision(number)).isEqualTo((byte) expectedLength);
    }

    @ParameterizedTest
    @MethodSource("testDigits")
    void testByStringConversion(int number, int expectedLength) {
        assertThat(NumberOfDigits.byStringConversion(number)).isEqualTo((byte) expectedLength);
    }

    private static Stream<Arguments> testDigits() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(5, 1),
                Arguments.of(10, 2),
                Arguments.of(17, 2),
                Arguments.of(100, 3),
                Arguments.of(1238237, 7)
        );
    }
}

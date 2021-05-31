import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator cal = new Calculator();

    @DisplayName("계산기")
    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2"})
    void changeResult (String input) {
        assertThat(cal.changeResult(input)).isEqualTo(10);
    }
}
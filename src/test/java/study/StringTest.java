package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
    @Test
    void replace () {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1")
    void split () {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
        assertThat(actual).containsExactly("1", "2");
        actual = "1".split(",");
        assertThat(actual).contains("1");
        assertThat(actual).containsExactly("1");

    }

    @Test
    @DisplayName("요구사항 1")
    void subString () {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).contains("1,2");
    }

    @Test
    @DisplayName("요구사항 2")
    void BoundException () {
        String actual = "abc";
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    actual.charAt(3);
                });
    }
    
}

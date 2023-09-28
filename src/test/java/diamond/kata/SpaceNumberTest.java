package diamond.kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class SpaceNumberTest {
    @ParameterizedTest
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
    Letter, space number
    A,0
    B,1
    Z,25
    """)
    void spaceNumber(char letter, int spaceNumber) {
        assertThat(Diamond.spaceNumber(letter))
                .isEqualTo(spaceNumber);
    }
}

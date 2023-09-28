package diamond.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiamondTopTest {

    @Test
    void top_A() {
        assertThat(Diamond.top('A'))
                .isEqualTo("");
    }

    @Test
    void top_B() {
        assertThat(Diamond.top('B'))
                .isEqualTo(" A");
    }

    @Test
    void top_C() {
        assertThat(Diamond.top('C'))
                .isEqualTo("""
                          A
                         B B
                        """);
    }
}

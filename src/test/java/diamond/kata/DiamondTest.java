package diamond.kata;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class DiamondTest {
    @Test
    void print_A() {
        assertThat(Diamond.print('A')).isEqualTo("A");
    }
    @Test
    void print_B() {
        assertThat(Diamond.print('B')).isEqualTo("""
                 A
                B B
                 A
                """);
    }

    @Test
    void print_C() {
        assertThat(Diamond.print('C')).isEqualTo("""
                  A
                 B B
                C   C
                 B B
                  A
                """);
    }
}
 /*

A

 A
B B
 A

  A
 B B
C   C
 B B
  A


  */


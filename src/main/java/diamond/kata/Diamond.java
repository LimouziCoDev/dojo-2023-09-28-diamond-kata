package diamond.kata;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class Diamond {
    public static String print(char letter) {
        IntStream.rangeClosed('A', letter).forEach(c -> System.out.println("c = " + (char) c));
        return switch (letter) {
            case 'B' -> """
                     A
                    B B
                     A
                    """;
            case 'C' -> """
                      A
                     B B
                    C   C
                     B B
                      A
                    """;
            default -> "A";
        };
    }

    public static int spaceNumber(char letter) {
        return letter - 'A';
    }

    public static String top(char letter) {
        final var spaceNumber = spaceNumber(letter);
        if (spaceNumber > 0) {
            var lineA = IntStream.range(0, spaceNumber)
                    .mapToObj(c -> " ")
                    .collect(joining()) + "A";
            if (letter == 'C') {
                return String.join("\n", lineA, IntStream.range(0, spaceNumber - 1)
                        .mapToObj(c -> " ")
                        .collect(joining()) + "B B\n");
            }
            return lineA;
        } else {
            return "";
        }
    }
}

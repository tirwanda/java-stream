package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {

    @Test
    void testAnyMatch() {
        Boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .anyMatch(num -> num > 20);

        System.out.println(match);
    }

    @Test
    void allMatch() {
        Boolean allMatch = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .allMatch(num -> num > 20);

        System.out.println(allMatch);
    }

    @Test
    void noneMatch() {
        Boolean noneMatch = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .noneMatch(num -> num > 20);

        System.out.println(noneMatch);
    }
}

package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        names.stream().max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        names.stream().min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        long count = names.stream().count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, data) -> value + data);
        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, data) -> value * data);
        System.out.println(result);
    }

}

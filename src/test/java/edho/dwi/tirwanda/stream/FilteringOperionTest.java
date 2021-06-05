package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperionTest {

    @Test
    void testFilter() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Edho", "Dwi", "Tirwanda", "Dwi", "Java", "Developer").stream()
                .distinct().forEach(System.out::println);
    }
}

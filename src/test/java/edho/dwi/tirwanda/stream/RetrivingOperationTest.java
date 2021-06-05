package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrivingOperationTest {

    @Test
    void testLimit() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");

        names.stream().limit(3).forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        names.stream().skip(3).forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");

        names.stream().takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        names.stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        Optional<String> findAny = names.stream().findAny();
        findAny.ifPresent(name -> System.out.println(name));
    }

    @Test
    void testFindFirst() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        Optional<String> findFirst = names.stream().findFirst();
        findFirst.ifPresent(name -> System.out.println(name));
    }
}

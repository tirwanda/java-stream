package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda");
        Stream<String> namesLower = names.stream().map(value -> value.toLowerCase());
        Stream<String> namesUpper = namesLower.map(value -> value.toUpperCase());
        namesUpper.forEach(System.out::println);
    }
}

package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {

    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to upperCase");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to upperCase");
                    return name.toUpperCase();
                });

        upper.forEach(System.out::println);
    }

}

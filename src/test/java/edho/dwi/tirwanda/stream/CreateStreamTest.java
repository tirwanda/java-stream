package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreatEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("Edho");

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Edho", "Dwi", "Tirwanda");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(System.out::println);

        String[] array = {
                "Edho", "Dwi", "Tirwanda"
        };
        Stream<String> stringFromArray = Arrays.stream(array);

        stringFromArray.forEach(data -> System.out.println(data));
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Edho", "Dwi", "Tirwanda");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Edho Dwi Tirwanda");
        // stream.forEach(System.out::println);
        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // iterate.forEach(System.out::println);
    }
}

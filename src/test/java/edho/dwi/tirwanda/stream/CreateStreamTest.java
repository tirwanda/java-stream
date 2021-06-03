package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
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

        String[] array = {
                "Edho", "Dwi", "Tirwanda"
        };
        Stream<String> stringFromArray = Arrays.stream(array);
    }
}

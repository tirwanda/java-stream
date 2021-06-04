package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Edho");
        builder.add("Dwi").add("Tirwanda");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder().add("Edho").add("Dwi").add("Tirwanda").build();
        stream.forEach(System.out::println);
    }
}

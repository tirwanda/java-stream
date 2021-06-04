package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamPipeLineTest {

    @Test
    void testStreamPipeLine() {
        List<String> list = List.of("Edho", "Dwi", "Tirwanda");

        list.stream()
                .map(data -> data.toUpperCase())
                .map(data -> "Mr. " + data)
                .forEach(System.out::println);
    }
}

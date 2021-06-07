package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ParallelStreamTest {
    @Test
    void testSquential() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallel()
                .forEach(num -> System.out.println(Thread.currentThread().getName() + " : " + num));
    }
}

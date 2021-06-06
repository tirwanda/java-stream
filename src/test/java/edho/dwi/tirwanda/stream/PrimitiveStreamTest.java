package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {
    @Test
    void testCreate() {
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(1, 2, 3, 4);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(3.2).build();
        doubleStream.forEach(System.out::println);
    }

    @Test
    void testOperation() {
        IntStream intStream = IntStream.range(1, 10);
        OptionalDouble optionalDouble = intStream.average();

        optionalDouble.ifPresent(System.out::println);

        IntStream.range(1, 10)
                .mapToObj(num -> "Number : " + num)
                .forEach(System.out::println);
    }
}

package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        names.stream().sorted().forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List<String> names = List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer");
        names.stream().sorted(reverseComparator).forEach(System.out::println);
    }
}

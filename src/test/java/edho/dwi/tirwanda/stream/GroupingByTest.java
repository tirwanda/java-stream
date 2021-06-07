package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> groupCollect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(num -> {
                    if(num > 5) {
                        return "Besar";
                    } else {
                        return "Kecil";
                    }
                }));

        System.out.println(groupCollect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> groupCollect = Stream.of("Edho", "Dwi", "Tirwanda", "Java", "Developer")
                .collect(Collectors.groupingBy(name -> {
                    if (name.length() > 4) {
                        return "Panjang";
                    } else {
                        return "Pendek";
                    }
                }));
        System.out.println(groupCollect);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> partitioning = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.partitioningBy(num -> num > 5));

        System.out.println(partitioning);
    }

    @Test
    void testPartitioning2() {
        Map<Boolean, List<String>> groupCollect = Stream.of("Edho", "Dwi", "Tirwanda", "Java", "Developer")
                .collect(Collectors.groupingBy(name -> name.length() > 4));
        System.out.println(groupCollect);
    }
}

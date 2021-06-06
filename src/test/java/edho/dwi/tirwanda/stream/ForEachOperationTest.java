package edho.dwi.tirwanda.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore() {
        List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer").stream()
                .map(name -> {
                    System.out.println("Before Change Name : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("After Change Name : " + upper);
                    return upper;
                }).forEach(System.out::println);
    }

    @Test
    void testPeekAfter() {
        List.of("Edho", "Dwi", "Tirwanda", "Java", "Developer").stream()
                .peek(name -> System.out.println("Before Change Name : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("After Change Name : " + upper))
                .forEach(System.out::println);
    }
}

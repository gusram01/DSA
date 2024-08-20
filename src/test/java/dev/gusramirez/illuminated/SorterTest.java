package dev.gusramirez.illuminated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SorterTest {
    @Test
    void testMerge() {
        var unordered = List.of(5, 4, 1, 8, 7, 2, 6, 3);

        var ordered = Sorter.byMerge(unordered);

        assertEquals(ordered, List.of(1, 2, 3, 4, 5, 6, 7, 8));

    }

    @Test
    void testMergeEmpty() {
        List<Integer> unordered = List.of();

        var ordered = Sorter.byMerge(unordered);

        assertEquals(ordered, List.of());

    }

    @Test
    void testMergeSingle() {
        List<Integer> unordered = List.of(1);

        var ordered = Sorter.byMerge(unordered);

        assertEquals(ordered, List.of(1));

    }

    @Test
    void testOddList() {
        List<Integer> unordered = List.of(5, 4, 1, 8, 7, 2, 6, 3, 9);

        var ordered = Sorter.byMerge(unordered);

        assertEquals(ordered, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    }

}

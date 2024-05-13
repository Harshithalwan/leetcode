package search;

import org.hhalwan.search.SearchingAlgorithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SearchingAlgorithmsTest {
    public static SearchingAlgorithms searchingAlgorithms = new SearchingAlgorithms();

    @Test
    public void successLinearSearch() {
        int[] arr = new int[]{4,2,6,8,10,1};
        Assertions.assertEquals(2, searchingAlgorithms.linearSearch(arr, 6));
    }

    @Test
    public void failLinearSearch() {
        int[] arr = new int[]{4,2,6,8,10,1};
        Assertions.assertEquals(-1, searchingAlgorithms.linearSearch(arr, 12));
    }

    @Test
    public void successBinarySearch() {
        int[] arr = new int[]{2,4,6,7,9,10,14,18,20,25};
        Assertions.assertEquals(8, searchingAlgorithms.binarySearch(arr, 20));
    }

    @Test
    public void failBinarySearch() {
        int[] arr = new int[]{2,4,6,7,9,10,14,18,20,25};
        Assertions.assertEquals(-1, searchingAlgorithms.binarySearch(arr, 12));
    }
}

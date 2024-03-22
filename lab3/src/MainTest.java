import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void bucketSortTest() {
        int[] array = {29, 25, 3, 49, 9, 37, 21, 43};
        int bucketSize = 10;
        Sort.bucketSort(array, bucketSize);
        int[] expected = {3, 9, 21, 25, 29, 37, 43, 49};
        Assert.assertArrayEquals(array, expected);
    }
    @Test
    public void emptyBucketSortTest() {
        int[] array = {};
        int bucketSize = 0;
        Sort.bucketSort(array, bucketSize);
        int[] expected = {};
        Assert.assertArrayEquals(array, expected);
    }
    @Test
    public void onlyNegativeBucketSortTest() {
        int[] array = {-29, -25, -3, -49, -9, -37, -21, -43};
        int bucketSize = 10;
        Sort.bucketSort(array, bucketSize);
        int[] expected = {-49, -43, -37, -29, -25, -21, -9, -3};
        Assert.assertArrayEquals(array, expected);
    }
}
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void bucketSort(int[] array, int bucketSize) {
        if (array.length == 0) {
            return;
        }

        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int value : array) {
            buckets.get((value - minValue) / bucketSize).add(value);
        }

        int currentIndex = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int value : bucket) {
                array[currentIndex++] = value;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {29, 25, 3, 49, 9, 37, 21, 43};
        int bucketSize = 10;
        bucketSort(array, bucketSize);

        System.out.print("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
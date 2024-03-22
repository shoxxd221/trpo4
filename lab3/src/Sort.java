import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/// Сортировки
public class Sort {
    /// Блочная сортировка
    public static void bucketSort(int[] array, int bucketSize) {
        if (array.length == 0) {
            return;
        }

        int minValue = FindMinValue(array);
        int maxValue = FindMaxValue(array);

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
    /// Нахождение минимального элемента
    private static int FindMinValue(int[] array)
    {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    /// Нахождение максимального элемента
    private static int FindMaxValue(int[] array)
    {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
             if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] array = {29, 25, 3, 49, 9, 37, 21, 43};
        int bucketSize = 10;
        Sort.bucketSort(array, bucketSize);

        System.out.print("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
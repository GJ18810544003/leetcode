package baodian.sort;

import baodian.Util;

public class QuickSort {


    public static void main(String[] args) {
        int[] arrays = Util.generateArray(10, 10);
        quickSort(arrays);
        Util.printArray(arrays);

    }

    public static void quickSort(int[] arrays) {
        if (arrays == null || arrays.length <= 1) {
            return;
        }
        quickSort(arrays, 0, arrays.length - 1);
    }

    public static void quickSort(int[] arrays, int low, int high) {
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;
        int index = arrays[left];

        while (left < right) {
            while (left < right && arrays[right] >= index) {
                right--;
            }
            if (left < right) {
                arrays[left] = arrays[right];
                left++;
            }

            while (left < right && arrays[left] < index) {
                left++;
            }
            if (left < right) {
                arrays[right] = arrays[left];
                right--;
            }
        }

        arrays[left] = index;
        quickSort(arrays, low, left - 1);
        quickSort(arrays, left + 1, high);


    }
}

package baodian.sort;

import baodian.Util;

public class SelectSort {

    public static void main(String[] args) {
        int[] array = Util.generateArray(10, 5);
        quickSort(array);
        Util.printArray(array);
    }

    public static int[] quickSort(int[] arr) {
        if(arr == null || arr.length <= 1) {
            return arr;
        }

        int minIndex = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }

        return arr;
    }
}

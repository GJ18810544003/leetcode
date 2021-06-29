package baodian.sort;

import baodian.Util;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = Util.generateArray(10, 10);
        //bubbleSort(arr);
        MySort(arr);
        Util.printArray(arr);

    }

    public static void bubbleSort(int[] arr) {
        if (arr == null  || arr.length <= 1) {
            return;
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static int[] MySort (int[] arr) {
        if (arr == null  || arr.length <= 1) {
            return arr;
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;
    }
}

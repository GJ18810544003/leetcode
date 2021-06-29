package baodian.sort;

import baodian.Util;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = Util.generateArray(10, 5);
        InsertSort(array);
        Util.printArray(array);
    }

    public static int[] InsertSort (int[] arr) {
        if(arr == null || arr.length <= 1) {
            return arr;
        }

        int j = 0;
        int cur = 0;
        for(int i = 1; i < arr.length; i++) {
            cur = arr[i];
            j = i;
            if(arr[j-1] > cur) {
                while(j >= 1 && arr[j-1] > cur) {
                    arr[j]  = arr[j-1];
                    j--;
                }

            }
            arr[j] =cur;
        }

        return arr;
    }
}

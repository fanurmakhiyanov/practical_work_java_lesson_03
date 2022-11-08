// Реализовать алгоритм сортировки слиянием

import java.util.logging.*;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};
        mergeSort(arr);
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n == 1)


        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for(int i = 0; i < mid; i++)
            l[i] = arr[i];
        for(int i = mid; i < n; i++)
            r[i - mid] = arr[i];

        mergeSort(l);
        mergeSort(r);
        mergeSort(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while(i < left && j < right) {
            if(l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
                idx++;
            }else 
        }
    }
}

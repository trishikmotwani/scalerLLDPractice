package com.revision.multithreading.basics.mergeSort;

import java.util.Arrays;

public class MergeSortRecursive {

    public static void main(String[] args) {

        int[] unsortedArray = new int[]{5, 9, 1, 10, 2, 8, 50, 4};
        // int[] unsortedArray2 = new int[]{2,3};

        int[] sorted = mergeSort(0, unsortedArray.length - 1, unsortedArray);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] mergeSort(int s, int e, int[] arr) {

        // base condn
        if(s == e) {
            return new int[]{arr[s]};
        }

        // main logic
        int mid = (s + e) /2;
        int[] s1 = mergeSort(s, mid, arr);
        int[] s2 = mergeSort(mid + 1, e, arr);
        return merge(s1, s2);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int N = arr1.length;
        int M = arr2.length;
        int i = 0, j = 0;
        int[] mergedArr = new int[N + M];
        int k = 0;

        while(i < N && j < M) {
            int nextElem = -1;
            if(arr1[i] <= arr2[j]) {
                nextElem = arr1[i];
                i++;
            } else {
                nextElem = arr2[j];
                j++;
            }
            mergedArr[k] = nextElem;
            k++;
        }
        while(i < N) {
            mergedArr[k] = arr1[i];i++;k++;
        }
        while(j < M) {
            mergedArr[k] = arr2[j];j++;k++;
        }
        return mergedArr;
    }
}

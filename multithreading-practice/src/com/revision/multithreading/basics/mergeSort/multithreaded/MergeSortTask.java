package com.revision.multithreading.basics.mergeSort.multithreaded;

import java.util.concurrent.*;

public class MergeSortTask implements Callable {
    int s;
    int e;
    int[] arr;
    MergeSortTask(int s, int e, int[] arr) {
        this.s = s; this.e = e; this.arr = arr;
    }
    @Override
    public int[] call() throws Exception {

        ExecutorService sortingExecutor = Executors.newFixedThreadPool(2);
        if(this.s == this.e) {
            return new int[] { this.arr[s]};
        }
        int mid = (this.s + this.e) / 2;

        MergeSortTask mergeSortTask1 = new MergeSortTask(this.s, mid, arr);
        Future<int[]> arr1Future = sortingExecutor.submit(mergeSortTask1);
        // int[] arr1 = arr1Future.get();

        MergeSortTask mergeSortTask2 = new MergeSortTask(mid + 1, this.e, arr);
        Future<int[]> arr2Future = sortingExecutor.submit(mergeSortTask2);
        // int[] arr2 = arr2Future.get();

        return merge(arr1Future.get(), arr2Future.get());
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

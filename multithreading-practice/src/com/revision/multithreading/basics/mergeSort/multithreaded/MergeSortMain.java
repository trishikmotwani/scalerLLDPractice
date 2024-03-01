package com.revision.multithreading.basics.mergeSort.multithreaded;

import com.revision.multithreading.basics.printTask.executerMethod.ExecuterMain;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortMain {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] unsortedArray = new int[]{5, 9, 1, 10, 2, 8, 50, 4};
        ExecutorService executor = Executors.newSingleThreadExecutor();
        MergeSortTask sortTask = new MergeSortTask(0, unsortedArray.length - 1, unsortedArray);
        Future<int[]> sortedArrayFuture = executor.submit(sortTask);
        int[] sortedArray = sortedArrayFuture.get();
        System.out.println("Sorted array using Merge Sort::" + Arrays.toString(sortedArray));
    }
}

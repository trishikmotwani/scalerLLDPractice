package com.revision.multithreading.basics.printTask.legacyMethod;

public class PrintNumbersClient {
    public static void main(String[] args) {

        // client wants to print numbers from 1 to 100
        System.out.println("main Method Thread name --> " + Thread.currentThread().getName());
        for(int i = 1; i <= 9901; i+=100) {
            Thread printingThread = new Thread(new PrintRangeTask(i, i + 10));
            printingThread.start();
        }

    }
}

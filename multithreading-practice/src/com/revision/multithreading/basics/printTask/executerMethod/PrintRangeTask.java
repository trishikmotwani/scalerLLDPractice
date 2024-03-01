package com.revision.multithreading.basics.printTask.executerMethod;

public class PrintRangeTask implements  Runnable {
    int start;
    int end;
    PrintRangeTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {

        for(int i = start; i < end; i++) {
            System.out.println(Thread.currentThread().getName() + " is printing number:" + i);
        }

    }
}

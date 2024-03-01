package com.revision.multithreading.basics.printTask.executerMethod;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterMain {

    public static void main(String[] args) {
//        Now in production we do not create threads by ourselves and then execute them, because we dont
//        know in actual how many threads will be created and having 10^5 threads is not a good practice,
//                So we give this responsibility to Executors who create a thread pool of fixed size ,
//        and we pass all task's to it and it schedules each task on each thread by using a queue
        // ArrayList<Thread> tasksToExecute = new ArrayList<Thread>();

        Executor executor = Executors.newFixedThreadPool(10);

        for(int i = 1; i <= 9901; i+=100) {
            // Legacy way -- creating threads yourself
            // Thread rangePrintingTask = new Thread(new PrintRangeTask(i, i + 10);

            // Executer way - let executer create threads for the task provided to it
            PrintRangeTask rangePrintingTask = new PrintRangeTask(i, i + 10);
            executor.execute(rangePrintingTask);
        }

    }
}

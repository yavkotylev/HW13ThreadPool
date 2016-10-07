package ru.sbt.threadpool;

import java.util.Scanner;

/**
 * Created by Yaroslav on 07.10.16.
 */
public class TaskCreator implements Runnable {
    final ThreadPool threadPool;

    public TaskCreator(ThreadPool threadPool) {
        this.threadPool = threadPool;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        while (true) {
            System.out.println("Write task (number seconds to working):");
            result = scanner.next();
            if (result.equals("exit")) {
                System.out.println("Goodbye");
                break;
            } else threadPool.execute(new TaskImpl(Integer.parseInt(result)));
        }
    }
}

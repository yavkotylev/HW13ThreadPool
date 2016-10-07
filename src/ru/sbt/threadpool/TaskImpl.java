package ru.sbt.threadpool;

/**
 * Created by Yaroslav on 07.10.16.
 */
class TaskImpl implements Runnable {
    int seconds;

    public TaskImpl(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " will work " + seconds + " seconds");
        while (seconds != 0) {
            try {
                System.out.println(Thread.currentThread().getName() + " sleep " + seconds + " seconds");
                Thread.sleep(1000);
                seconds--;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

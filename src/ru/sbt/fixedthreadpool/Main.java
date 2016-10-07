package ru.sbt.fixedthreadpool;



import ru.sbt.threadpool.TaskCreator;
import ru.sbt.threadpool.ThreadPool;

/**
 * Created by Yaroslav on 31.08.16.
 */
public class Main {
    public static void main(String[] args) {
        ThreadPool threadPool = new FixedThreadPool(5);
        threadPool.start();
        new Thread(new TaskCreator(threadPool)).start();
    }
}

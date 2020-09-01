package com.company;
import java.lang.Runnable;

/**
 * Created by Ilyas on 30.06.2017.
 */
public class ThreadFactory {
    public static void createThread()
    {
        new Thread(new MyRunnable()).start();
    }
}

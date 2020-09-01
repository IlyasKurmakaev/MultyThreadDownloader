package com.company;

/**
 * Created by Ilyas on 30.06.2017.
 */
public class MyRunnable implements Runnable {
    String URLString;

    @Override
    public void run() {
        synchronized (System.out) {
            System.out.println("runnable sucksessfully runned");
        }

        while (true) {
            synchronized (URLStorage.getURLStorageSingltone().getStorageURL()) {
                if (!URLStorage.getURLStorageSingltone().getStorageURL().isEmpty()) {
                    URLString = URLStorage.getURLStorageSingltone().getURL(0);
                    URLStorage.getURLStorageSingltone().removeURL(0);
                } else {
                    System.out.println("On PUST");
                    break;
                }
            }
            Downloader.download(URLString);

        }
        synchronized (System.out) {
            System.out.println("runnable end the work");
        }

    }
}

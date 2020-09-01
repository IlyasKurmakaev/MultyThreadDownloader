package com.company;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Ilyas on 28.07.2017.
 */

public class ProgressManager {
    private double onePercent;
    private int alreadyDownloaded;
    public void consideOnePercent(URL url) {
        try {
            onePercent = url.openConnection().getContentLength() / 100;     // в отдельный метод чтобы реже вызывать getContentLength
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Baget");
        }
    }

    public int consideProgress(int size)
    {
        alreadyDownloaded += size;
        return alreadyDownloaded / (int)onePercent;
    }

}

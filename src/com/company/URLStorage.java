package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilyas on 30.06.2017.
 */
public class URLStorage {
    private List<String> storageURL = new ArrayList<>();
    public static URLStorage urlStorageSingltone;

    public static synchronized URLStorage getURLStorageSingltone()
    {
        if (urlStorageSingltone == null)
        {
            urlStorageSingltone = new URLStorage();
        }
        return urlStorageSingltone;
    }

    public void setURl(String inputURL) {
        storageURL.add(inputURL);
    }

    public void removeURL(int index) {
        storageURL.remove(index);
    }

    public String getURL(int index) {
        return storageURL.get(index);
    }

    public List<String> getStorageURL() {
        return storageURL;
    }

}

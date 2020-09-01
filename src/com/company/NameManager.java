package com.company;

/**
 * Created by Ilyas on 07.08.2017.
 */

public class NameManager {
    private static NameManager nameManager;
    NameManager() {
    }


    private static int a = 0;
    public synchronized static int getNewNameCode()
    {
        return ++a;
    }
}

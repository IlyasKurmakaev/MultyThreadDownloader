package com.company;

import com.company.GUI.GUI;

public class Main {

    public static void main(String[] args) {

        GUI.getInstance();
        for (int i = 0; i <10; i++) {
            URLStorage.getURLStorageSingltone().setURl("https://avatars.mds.yandex.net/get-pdb/992060/8b6c93c1-a96a-4cc6-af18-e782d068e701/s1200");
        }

        for (int i = 0; i < 2; i++)
        {
            ThreadFactory.createThread();
        }


    }
}

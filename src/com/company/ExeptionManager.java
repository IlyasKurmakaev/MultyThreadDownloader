package com.company;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Ilyas on 08.08.2017.
 */
public class ExeptionManager {
    private static FileWriter fileWriter;

    private ExeptionManager() {
        try {
            fileWriter = new FileWriter("ExeptionLog.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ExeptionManager exeptionManager;

    public static ExeptionManager getInstance() {
        if (exeptionManager == null) {
            exeptionManager = new ExeptionManager();
        }
        return exeptionManager;
    }


    public void writeInFile(IOException e) {
        try {
            fileWriter.write(e.toString() + "\n");
            fileWriter.flush();
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }

    public static void sendMessegeErrorDialog() {
        JOptionPane.showMessageDialog(null, "Ой... Кажется произошла ошибка :( подробней смотрите в ExeptionLog.txt");
    }
}

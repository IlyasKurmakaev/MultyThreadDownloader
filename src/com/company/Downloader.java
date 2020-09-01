package com.company;

import com.company.GUI.ManagingProgressBars.CreateProgressBar;
import com.company.GUI.GUI;
import com.company.GUI.ManagingProgressBars.IInvokeLaterMethod;
import com.company.GUI.ManagingProgressBars.RemoveProgressBar;
import com.company.GUI.ManagingProgressBars.ReportProgressBar;
import com.company.GUI.ProgressBar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Ilyas on 25.07.2017.
 */
public class Downloader {

    public static void download(String downloadURL) {

        try {
            URL url = new URL(downloadURL);
            ProgressManager progressManager = new ProgressManager();
            progressManager.consideOnePercent(url);
            InputStream stream = url.openStream();
            String newName = Integer.toString(NameManager.getNewNameCode());
            ProgressBar progressBar = new ProgressBar("file" + newName + ".jpg");
            IInvokeLaterMethod iInvokeLaterMethod;
            iInvokeLaterMethod = new CreateProgressBar();    // бюджетная\быстро состряпанная стратегия
            iInvokeLaterMethod.useMethodForProgressBar(progressBar);
            FileOutputStream fileOutputStream = new FileOutputStream("file" + newName + ".jpg");
            byte buffer[] = new byte[1024];
            int size;
            while ((size = stream.read(buffer)) != -1) {
                //System.out.println(size);
                fileOutputStream.write(buffer, 0, size);
                iInvokeLaterMethod = new ReportProgressBar();
                iInvokeLaterMethod.useMethodForProgressBar(progressBar, progressManager.consideProgress(size));
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            stream.close();
            iInvokeLaterMethod = new RemoveProgressBar();
            iInvokeLaterMethod.useMethodForProgressBar(progressBar);
        } catch (IOException IOE) {
            synchronized (System.out) {
                //IOE.printStackTrace();
                synchronized (ExeptionManager.getInstance()) {
                    ExeptionManager.getInstance().writeInFile(IOE);
                    ExeptionManager.sendMessegeErrorDialog();
                    System.out.println("Baget");
                }
            }
        } catch (Exception e) {
            System.out.println("Unknown baget of the lost star");
        }
    }
}

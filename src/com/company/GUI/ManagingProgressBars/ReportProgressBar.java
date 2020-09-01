package com.company.GUI.ManagingProgressBars;

import com.company.GUI.GUI;
import com.company.GUI.ProgressBar;

/**
 * Created by Ilyas on 08.08.2017.
 */
public class ReportProgressBar implements IInvokeLaterMethod{
    @Override
    public void useMethodForProgressBar(ProgressBar progressBar) {
        System.out.println("baget");
    }

    @Override
    public void useMethodForProgressBar(ProgressBar progressBar, int progress) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                progressBar.setProgressBar(progress);
                GUI.getInstance().revalidate();
                GUI.getInstance().repaint();
            }
        });
    }
}

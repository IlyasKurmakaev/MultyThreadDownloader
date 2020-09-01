package com.company.GUI.ManagingProgressBars;

import com.company.GUI.ProgressBar;

/**
 * Created by Ilyas on 19.08.2017.
 */
public class ReportProgressBarV2 implements IInvokeLaterMethod {
    private int progress;

    public ReportProgressBarV2(int progress) {
        this.progress = progress;
    }

    @Override
    public void useMethodForProgressBar(ProgressBar progressBar) {
        progressBar.setProgressBar(progress);
    }

    @Override
    public void useMethodForProgressBar(ProgressBar progressBar, int progress) {

    }
}

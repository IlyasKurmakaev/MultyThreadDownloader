package com.company.GUI.ManagingProgressBars;

import com.company.GUI.ProgressBar;

/**
 * Created by Ilyas on 08.08.2017.
 */

public interface IInvokeLaterMethod {
    public void useMethodForProgressBar(ProgressBar progressBar);
    public void useMethodForProgressBar(ProgressBar progressBar, int progress);
}

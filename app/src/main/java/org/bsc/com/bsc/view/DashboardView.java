package org.bsc.com.bsc.view;

import org.bsc.com.bsc.Model;

/**
 * Created by sanjit on 20/12/17.
 */

public interface DashboardView {
    public void onFailure(String result, int code);
    void setData(Model model);




}

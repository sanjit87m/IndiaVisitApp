package org.bsc.com.bsc.presenter;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.bsc.com.bsc.Interactor.Interactor;
import org.bsc.com.bsc.Interactor.InteractorImp;
import org.bsc.com.bsc.Model;
import org.bsc.com.bsc.view.DashboardView;


public class DashboardPresenterImp implements DashboardPresenter, Interactor.DataRetriveListener {

    DashboardView dashboardView;
    InteractorImp interactorImp;
    String url;
    public DashboardPresenterImp(DashboardView dashboardView, String url) {
        this.dashboardView = dashboardView;
        interactorImp = new InteractorImp();
        this.url = url;
    }



    @Override
    public void getDashboardjsondata() {
        interactorImp.getData(this,url);
    }


    @Override
    public void onSuccess(String jsonData) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
         Model model = gson.fromJson(jsonData, Model.class);
        dashboardView.setData(model);

    }

    @Override
    public void onFaliure() {
        dashboardView.onFailure("An error occurred", 201);

    }


}

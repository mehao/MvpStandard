package com.example.mehao.mvp.presenter;

import android.content.Context;

import com.example.mehao.mvp.ui.view.MainView;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import javax.inject.Inject;

/**
 * Created by mehao on 2016/10/19.
 */

public class MainPresenter extends MvpBasePresenter<MainView>{

    private Context mContext;

    @Inject
    MainPresenter(Context context) {
        mContext = context;
    }

    public void onClickText(){
        if (getView() != null) {
            getView().showToast();
        }
    }
}

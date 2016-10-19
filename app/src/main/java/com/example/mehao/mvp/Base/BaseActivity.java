package com.example.mehao.mvp.Base;

import android.os.Bundle;

import com.example.mehao.mvp.app.MvpApplication;
import com.example.mehao.mvp.dagger.ActivityModule;
import com.example.mehao.mvp.dagger.ApplicationComponent;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

import butterknife.ButterKnife;
import icepick.Icepick;

/**
 * Created by mehao on 2016/10/19.
 */

public abstract class BaseActivity <V extends MvpView, P extends MvpPresenter<V>> extends com.example.mehao.mvp.Base.MvpActivity<V, P> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        injectDependencies();
        super.onCreate(savedInstanceState);
    }

    @Override public void onContentChanged() {
        super.onContentChanged();
        ButterKnife.bind(this);
    }

    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Icepick.saveInstanceState(this, outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    protected void injectDependencies() {
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((MvpApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    @Override
    public void finish() {
        super.finish();
    }
}

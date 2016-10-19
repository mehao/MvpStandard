package com.example.mehao.mvp.app;

import android.app.Application;

import com.example.mehao.mvp.dagger.ApplicationComponent;
import com.example.mehao.mvp.dagger.ApplicationModule;
import com.example.mehao.mvp.dagger.DaggerApplicationComponent;

/**
 * Created by mehao on 2016/10/19.
 */

public class MvpApplication extends Application{

    public ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}

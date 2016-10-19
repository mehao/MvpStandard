package com.example.mehao.mvp.dagger;

import com.example.mehao.mvp.presenter.MainPresenter;
import com.example.mehao.mvp.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by mehao on 2016/10/19.
 */
@PerActivity
@Component(modules = {MainModule.class, ActivityModule.class},
        dependencies = ApplicationComponent.class)
public interface MainComponent extends ActivityComponent {

    MainPresenter mainPresenter();
    void inject(MainActivity activity);
}

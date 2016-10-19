package com.example.mehao.mvp.dagger;

import android.app.Activity;

import dagger.Component;

/**
 * Created by sunxiaodong on 2015/12/9.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}

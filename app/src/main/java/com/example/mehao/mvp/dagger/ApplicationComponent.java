package com.example.mehao.mvp.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sunxiaodong on 2015/12/9.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Context context();
}

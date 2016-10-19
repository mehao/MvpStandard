package com.example.mehao.mvp.dagger;

import android.content.Context;

import com.example.mehao.mvp.app.MvpApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunxiaodong on 2015/12/9.
 */
@Module
public class ApplicationModule {

    private final MvpApplication application;

    public ApplicationModule(MvpApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return this.application;
    }

}

package com.example.mehao.mvp.dagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunxiaodong on 2015/12/9.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    /**
     * Expose the activity to dependents in the graph.
     */
    @Provides
    @PerActivity
    Activity activity() {
        return this.activity;
    }
}

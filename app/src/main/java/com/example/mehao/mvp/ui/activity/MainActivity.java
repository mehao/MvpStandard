package com.example.mehao.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mehao.mvp.Base.BaseActivity;
import com.example.mehao.mvp.R;
import com.example.mehao.mvp.dagger.DaggerMainComponent;
import com.example.mehao.mvp.dagger.MainComponent;
import com.example.mehao.mvp.presenter.MainPresenter;
import com.example.mehao.mvp.ui.view.MainView;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by mehao on 2016/10/19.
 */
public class MainActivity extends BaseActivity<MainView, MainPresenter> implements MainView {

    private MainComponent mMainComponent;

    @Bind(R.id.text)
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return mMainComponent.mainPresenter();
    }

    @Override
    protected void injectDependencies() {
        mMainComponent = DaggerMainComponent.builder().applicationComponent(getApplicationComponent()).activityModule(getActivityModule()).build();
        mMainComponent.inject(this);
    }

    @OnClick(R.id.text)
    protected void onTextClick(){
        presenter.onClickText();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "you click me!!", Toast.LENGTH_SHORT).show();
    }
}

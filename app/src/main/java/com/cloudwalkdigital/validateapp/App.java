package com.cloudwalkdigital.validateapp;

import android.app.Application;

import com.cloudwalkdigital.validateapp.dagger.DaggerNetComponent;
import com.cloudwalkdigital.validateapp.dagger.NetComponent;
import com.cloudwalkdigital.validateapp.dagger.modules.AppModule;
import com.cloudwalkdigital.validateapp.dagger.modules.NetModule;

/**
 * Created by alleoindong on 6/19/17.
 */

public class App extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://192.168.1.87:8000/api/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}

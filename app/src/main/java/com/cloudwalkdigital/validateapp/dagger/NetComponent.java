package com.cloudwalkdigital.validateapp.dagger;

import com.cloudwalkdigital.validateapp.LoginActivity;
import com.cloudwalkdigital.validateapp.dagger.modules.AppModule;
import com.cloudwalkdigital.validateapp.dagger.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alleoindong on 6/19/17.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(LoginActivity activity);
//    void inject(SessionManager sessionManager);
}

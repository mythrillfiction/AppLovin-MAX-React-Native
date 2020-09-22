package com.applovin.reactnative;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * Created by Thomas So on July 11 2020
 */
public class AppLovinMAXPackage
        implements ReactPackage
{
    @Override
    @NonNull
    public List<NativeModule> createNativeModules(@NonNull final ReactApplicationContext reactContext)
    {
        List<NativeModule> module = new ArrayList<>( 1 );
        module.add( new AppLovinMAXModule( reactContext ) );
        return module;
    }

    @Override
    @NonNull public List<ViewManager> createViewManagers(@NonNull final ReactApplicationContext reactContext)
    {
        return Collections.emptyList();
    }
}

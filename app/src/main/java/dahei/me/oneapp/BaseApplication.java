package dahei.me.oneapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

import dahei.me.base.AppContext;

/**
 * created by yubosu
 * 2018年09月21日上午9:30
 */
public class BaseApplication extends  Application implements ReactApplication {



    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage()
            );
        }

        @Override
        protected String getJSMainModuleName() {
            return "index";
        }

        @Nullable
        @Override
        protected String getJSBundleFile() {
            return "ReactNative.bundle";
        }

        @Nullable
        @Override
        protected String getBundleAssetName() {
            return "ReactNative.bundle";
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        AppContext.init(getApplicationContext());
        SoLoader.init(this, /* native exopackage */ false);
    }

}

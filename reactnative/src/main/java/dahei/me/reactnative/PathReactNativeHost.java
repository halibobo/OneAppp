package dahei.me.reactnative;

import android.app.Application;

import com.facebook.infer.annotation.Assertions;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainReactPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * created by yubosu
 * 2018年09月20日下午5:39
 */
public class PathReactNativeHost extends ReactNativeHost {


    public PathReactNativeHost(Application application) {
        super(application);
    }

    @Override
    public boolean getUseDeveloperSupport() {
        return true;
    }

    @Override
    protected List<ReactPackage> getPackages() {
        ArrayList<ReactPackage> list = new ArrayList<>();
        list.add(new MainReactPackage());
        return list;
    }

    @Override
    protected ReactInstanceManager createReactInstanceManager() {
        ReactInstanceManagerBuilder builder = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setJSMainModuleName(getJSMainModuleName())
                .setUseDeveloperSupport(getUseDeveloperSupport())
                .setRedBoxHandler(getRedBoxHandler())
                .setUIImplementationProvider(getUIImplementationProvider())
                .setInitialLifecycleState(LifecycleState.BEFORE_CREATE);

        for (ReactPackage reactPackage : getPackages()) {
            builder.addPackage(reactPackage);
        }

        String jsBundleFile = getJSBundleFile();
        if (jsBundleFile != null) {
            builder.setJSBundleFile(jsBundleFile);
        } else {
            builder.setBundleAssetName(Assertions.assertNotNull(getBundleAssetName()));
        }
        return builder.build();
    }
}

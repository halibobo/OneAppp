package dahei.me.reactnative;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.widget.Toast;

import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionListener;

import javax.annotation.Nullable;

/**
 * created by yubosu
 * 2018年09月20日下午5:11
 */
public class PathReactActivityDelegate  extends ReactActivityDelegate{

    private Bundle bundle;
    private final @Nullable
    Activity mActivity;

    public PathReactActivityDelegate(Activity activity, @Nullable String mainComponentName) {
        super(activity, mainComponentName);
        this.mActivity = activity;
    }

    public void setLaunchOptions(Bundle bundle) {
        this.bundle = bundle;
    }


    protected @Nullable
    Bundle getLaunchOptions() {
        return bundle;
    }

    /**
     * Get the {@link ReactNativeHost} used by this app. By default, assumes
     * {@link Activity#getApplication()} is an instance of {@link ReactApplication} and calls
     * {@link ReactApplication#getReactNativeHost()}. Override this method if your application class
     * does not implement {@code ReactApplication} or you simply have a different mechanism for
     * storing a {@code ReactNativeHost}, e.g. as a static field somewhere.
     */
    protected ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) mActivity.getApplication()).getReactNativeHost();
    }

    public ReactInstanceManager getReactInstanceManager() {
        return getReactNativeHost().getReactInstanceManager();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}

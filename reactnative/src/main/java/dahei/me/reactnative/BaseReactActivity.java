package dahei.me.reactnative;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;

import javax.annotation.Nullable;

/**
 * created by yubosu
 * 2018年09月20日下午4:30
 */
public class BaseReactActivity extends ReactActivity {

    private PathReactActivityDelegate mDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     * e.g. "MoviesApp"
     */
    protected @Nullable
    String getMainComponentName() {
        return "dahei";
    }

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        mDelegate = new PathReactActivityDelegate(this, getMainComponentName());
        return mDelegate;
    }

    public PathReactActivityDelegate getmDelegate() {
        return mDelegate;
    }



    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

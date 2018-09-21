package dahei.me.reactnative;

import com.facebook.react.ReactNativeHost;

/**
 * created by yubosu
 * 2018年09月21日上午10:19
 */
public interface DaHeiReactApplication {
    /**
     * Get the default {@link ReactNativeHost} for this app.
     */
    ReactNativeHost getReactNativeHost(String assertName);

    ReactNativeHost getReactNativeHost(String assertName,String path);
}

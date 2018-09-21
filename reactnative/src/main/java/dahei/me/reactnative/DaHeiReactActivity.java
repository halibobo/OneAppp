package dahei.me.reactnative;

import android.os.Bundle;

import javax.annotation.Nullable;

/**
 * created by yubosu
 * 2018年09月21日上午9:53
 */
public class DaHeiReactActivity extends BaseReactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getmDelegate().setLaunchOptions(getIntent().getExtras());

    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     * e.g. "MoviesApp"
     */
    protected @Nullable
    String getMainComponentName() {
        return "helloreact";
    }
}

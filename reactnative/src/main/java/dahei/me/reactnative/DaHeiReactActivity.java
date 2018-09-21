package dahei.me.reactnative;

import android.os.Bundle;

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
}

package dahei.me.reactnative;

import android.content.Intent;

import dahei.me.base.AppContext;
import dahei.me.base.Test;

/**
 * created by yubosu
 * 2018年09月21日上午10:07
 */
public class ReactNativeTest implements Test {

    @Override
    public void doTest() {
        Intent intent = new Intent(AppContext.getInstance(), DaHeiReactActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        AppContext.getInstance().startActivity(intent);

    }

    @Override
    public String getTestName() {
        return "React Native Test";
    }

}

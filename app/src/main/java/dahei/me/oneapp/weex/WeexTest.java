package dahei.me.oneapp.weex;

import android.content.Intent;

import dahei.me.base.AppContext;
import dahei.me.base.Test;
import dahei.me.weex.WXPageActivity;

/**
 * created by yubosu
 * 2018年09月21日下午2:20
 */
public class WeexTest implements Test{
    @Override
    public void doTest() {
        Intent intent = new Intent(AppContext.getInstance(), WXPageActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        AppContext.getInstance().startActivity(intent);
        
    }

    @Override
    public String getTestName() {
        return "Weex Test";
    }
}

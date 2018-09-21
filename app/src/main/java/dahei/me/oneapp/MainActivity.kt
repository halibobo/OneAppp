package dahei.me.oneapp

import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import dahei.me.base.Test
import dahei.me.reactnative.ReactNativeTest

/**
 * created by yubosu
 * 2018年09月21日上午10:04
 */
class MainActivity : AppCompatActivity() {

    private val REQUEST_EXTERNAL_STORAGE = 1
    private val PERMISSIONS_STORAGE = arrayOf("android.permission.READ_EXTERNAL_STORAGE",
            "android.permission.WRITE_EXTERNAL_STORAGE")

    private lateinit var viewManager: RecyclerView.LayoutManager

    private val recyclerView: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.listView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        init()
        permission()
    }

    private fun init() {
        viewManager = LinearLayoutManager(this)
        val data: List<Test> = arrayOf(
               ReactNativeTest()).toList()
        val viewAdapter = TesterAdapter(data)
        recyclerView.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    private fun permission() {
        try {
            //检测是否有写的权限
            val permission = ActivityCompat.checkSelfPermission(this,
                    "android.permission.WRITE_EXTERNAL_STORAGE")
            var permission2 = ActivityCompat.checkSelfPermission(this,
                    "android.permission.READ_EXTERNAL_STORAGE")
            if (permission != PackageManager.PERMISSION_GRANTED || permission2 != PackageManager.PERMISSION_GRANTED) {
                // 没有写的权限，去申请写的权限，会弹出对话框
                ActivityCompat.requestPermissions(this, PERMISSIONS_STORAGE, REQUEST_EXTERNAL_STORAGE)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}
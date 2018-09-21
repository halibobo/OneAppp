package dahei.me.oneapp

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import dahei.me.base.Test

/**
 * created by yubosu
 * 2018年07月31日上午10:20
 */

class TesterAdapter( private val myDataSet: List<Test>) : RecyclerView.Adapter<TesterAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.tester_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val textView = holder.textView.findViewById<TextView>(R.id.textTitle)
        textView.text = myDataSet[position].testName

        holder.textView.setOnClickListener {
            exeFun(
                    myDataSet[position]
            ) }
    }

    override fun getItemCount() = myDataSet.size

    private fun exeFun( test: Test) {
        Log.d("exeFun", "exeFun")
        test.doTest()
    }

    class ViewHolder(val textView: View) : RecyclerView.ViewHolder(textView)
}
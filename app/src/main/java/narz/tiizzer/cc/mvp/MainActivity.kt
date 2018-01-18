package narz.tiizzer.cc.mvp

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import narz.tiizzer.cc.mvp.adapter.ListViewAdapter
import narz.tiizzer.cc.mvp.base.ActivityView
import narz.tiizzer.cc.mvp.interfaces.MVP

class MainActivity : ActivityView() {

    lateinit var listview: RecyclerView
        private set

    lateinit var adapter: ListViewAdapter
        private set

    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    override fun setPresenter(): MVP.Presenter {
        return MainActivityPresenter(this)
    }

    override fun setupView() {
        this.initialView()
        this.presenter.load()
    }

    override fun onPresenterLoaded(data: Any) {
        (this.listview.adapter as ListViewAdapter).collection = data as ArrayList<*>
        (this.listview.adapter as ListViewAdapter).notifyDataSetChanged()
    }

    protected fun initialView(){
        this.listview = findViewById<RecyclerView>(R.id.item_list).also {
            it.layoutManager = LinearLayoutManager(this)
        }

        this.adapter = ListViewAdapter.init()
        this.listview.adapter = this.adapter
    }
}

package narz.tiizzer.cc.mvp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import narz.tiizzer.cc.mvp.R
import narz.tiizzer.cc.mvp.model.ListItemModel

/**
 * Created by narztiizzer on 18/1/2018 AD.
 */
class ListViewAdapter: RecyclerView.Adapter<ListViewItem>() {

    lateinit var collection: ArrayList<*>

    companion object {
        fun init(): ListViewAdapter{
            return ListViewAdapter()
        }
    }

    override fun onBindViewHolder(holder: ListViewItem?, position: Int) {
        holder?.let {
            it.title?.text = (this.collection.get(position) as ListItemModel).title
            it.subtitle?.text = (this.collection.get(position) as ListItemModel).subtitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewItem {
        return ListViewItem(LayoutInflater.from(parent!!.context).inflate(R.layout.item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return this.collection.size
    }

}
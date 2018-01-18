package narz.tiizzer.cc.mvp.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import narz.tiizzer.cc.mvp.R

/**
 * Created by narztiizzer on 18/1/2018 AD.
 */
class ListViewItem: RecyclerView.ViewHolder {
    var title: TextView? = null
    var subtitle: TextView? = null

    constructor(view: View) : super(view) {
        this.title = view.findViewById(R.id.title)
        this.subtitle = view.findViewById(R.id.subtitle)
    }

    fun setTitle(title: String){
        this.title?.text = title
    }

    fun setSubTitle(subtitle: String){
        this.subtitle?.text = subtitle
    }
}
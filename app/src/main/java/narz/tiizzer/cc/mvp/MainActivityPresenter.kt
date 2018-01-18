package narz.tiizzer.cc.mvp

import narz.tiizzer.cc.mvp.base.Presenter
import narz.tiizzer.cc.mvp.interfaces.MVP
import narz.tiizzer.cc.mvp.model.ListItemModel

/**
 * Created by narztiizzer on 18/1/2018 AD.
 */
class MainActivityPresenter(view: MVP.View): Presenter(view) {
    private lateinit var modelCollection: ArrayList<MainActivityModel>
    private lateinit var listDataCollection: ArrayList<ListItemModel>

    override fun setModel(): Any {
        return MainActivityModel.make()
    }

    override fun setup() {
        this.modelCollection = ArrayList()
        this.listDataCollection = ArrayList()
    }

    override fun load() {
        this.modelCollection = (super.model as MainActivityModel).fetchFromDB()
        this.prepareDataCollection()
        this.view.onPresenterLoaded(this.listDataCollection)
    }

    private fun prepareDataCollection() {
        for(item in this.modelCollection){
            var model = ListItemModel()
            model.title = "MVP ITEM : ${ item._id }"
            model.subtitle = item.timestamp.toString()
            this.listDataCollection.add(model)
        }
    }
}
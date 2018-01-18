package narz.tiizzer.cc.mvp

import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by narztiizzer on 18/1/2018 AD.
 */
class MainActivityModel {
    var _id: Int = 0
    var timestamp: Long = 0

    companion object {
        fun make(): MainActivityModel{
            return MainActivityModel()
        }
    }

    fun fetchFromDB(): ArrayList<MainActivityModel>{
        var modelCollection: ArrayList<MainActivityModel> = ArrayList()
        for(index in 1..5){
            var model = MainActivityModel()
            model._id = index
            model.timestamp = Date().time
            modelCollection.add(model)
        }
        return modelCollection
    }
}
package narz.tiizzer.cc.mvp.base

import narz.tiizzer.cc.mvp.interfaces.MVP

/**
 * Created by narztiizzer on 18/1/2018 AD.
 */
abstract class Presenter: MVP.Presenter {
    protected var view: MVP.View
    protected var model: Any

    protected abstract fun setModel(): Any

    constructor(view: MVP.View) {
        this.model = this.setModel()
        this.view = view
        this.setup()
    }
}
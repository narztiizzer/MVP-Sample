package narz.tiizzer.cc.mvp.interfaces

/**
 * Created by narztiizzer on 18/1/2018 AD.
 */
interface MVP {
    interface View{
        fun setupView()
        fun onPresenterLoaded(data: Any)
    }

    interface Presenter{
        fun setup()
        fun load()
    }
}
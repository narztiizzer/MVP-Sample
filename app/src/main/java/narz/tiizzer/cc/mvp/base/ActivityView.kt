package narz.tiizzer.cc.mvp.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import narz.tiizzer.cc.mvp.interfaces.MVP

/**
 * Created by narztiizzer on 18/1/2018 AD.
 */
abstract class ActivityView: AppCompatActivity(), MVP.View{
    protected lateinit var presenter: MVP.Presenter

    abstract fun setLayout(): Int
    abstract fun setPresenter(): MVP.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(this.setLayout())
        this.presenter = this.setPresenter()
        this.setupView()
    }
}
package com.dv.kotlin.kotlinexcersice.app

import android.app.Application
import com.dv.kotlin.kotlinexcersice.others.MySharedPreferences

val preferences: MySharedPreferences by lazy { MyApp.prefs!! }

class MyApp: Application(){

    companion object{
        var prefs: MySharedPreferences? = null
    }

    override fun onCreate() {
        super.onCreate()
        prefs = MySharedPreferences( applicationContext )
    }
}
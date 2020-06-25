package com.ibrahim.maatki.currencychallenge

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication

/**
 * Created by Zedney Creative on 25/06/2020.
 */
class CurrencyChallengeApp : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
//        Thread.setDefaultUncaughtExceptionHandler(ExceptionHandler())
    }
}
package com.ibrahim.maatki.currencychallenge.di

import android.content.Context
import android.content.res.AssetManager
import com.squareup.moshi.Moshi
import com.zedney.cityguide.CityGuideApp
import com.zedney.cityguide.communs.ApiEndpoint
import com.zedney.cityguide.communs.Session
import com.zedney.cityguide.communs.util.LocaleUtil
import com.zedney.cityguide.communs.util.PreferenceUtil
import com.zedney.cityguide.data.commons.ApiErrorResponse
import com.ibrahim.maatki.currencychallenge.di.modules.AppModule
import com.ibrahim.maatki.currencychallenge.di.modules.NetworkModule
import com.ibrahim.maatki.currencychallenge.di.modules.RetrofitServiceModule
import com.ibrahim.maatki.currencychallenge.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by Zedney Creative on 25/01/2020.
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ViewModelModule::class,
        AppModule::class,
        ActivityBuilder::class,
        NetworkModule::class,
        RetrofitServiceModule::class
    ]
)
interface AppComponent : AndroidInjector<CityGuideApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindApp(app: CityGuideApp): Builder

        fun build(): AppComponent
    }

    fun wahedApp(): CityGuideApp

    fun context(): Context

    fun assetManager(): AssetManager

    fun moshi(): Moshi

    fun api(): ApiEndpoint

    fun preferenceUtil(): PreferenceUtil

    fun localeUtil(): LocaleUtil

    fun session(): Session

    fun retrofit(): Retrofit

    fun responseBodyConverter(): Converter<ResponseBody, ApiErrorResponse>
}
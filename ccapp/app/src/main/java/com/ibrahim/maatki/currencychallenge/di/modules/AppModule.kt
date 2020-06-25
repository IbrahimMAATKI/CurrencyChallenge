package com.ibrahim.maatki.currencychallenge.di.modules

import android.content.Context
import android.content.res.AssetManager
import com.zedney.cityguide.CityGuideApp
import com.zedney.cityguide.communs.ApiEndpoint
import com.zedney.cityguide.communs.Session
import com.zedney.cityguide.communs.util.LocaleUtil
import com.zedney.cityguide.communs.util.PreferenceUtil
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun app(app: CityGuideApp): Context

    @Module
    companion object {
        @JvmStatic
        @Provides
        @Singleton
        fun provideApiEndpoint(context: Context) = ApiEndpoint(context)

        @JvmStatic
        @Provides
        @Singleton
        fun providePreferenceUtil(app: CityGuideApp) = PreferenceUtil(app)

        @JvmStatic
        @Provides
        @Singleton
        fun provideLocaleUtil(app: CityGuideApp) = LocaleUtil(app)

        @JvmStatic
        @Provides
        @Singleton
        fun provideSession(preferenceUtil: PreferenceUtil, localeUtil: LocaleUtil) =
            Session(preferenceUtil, localeUtil)

        @JvmStatic
        @Provides
        @Singleton
        fun provideAssetManager(context: Context): AssetManager = context.applicationContext.assets
    }
}

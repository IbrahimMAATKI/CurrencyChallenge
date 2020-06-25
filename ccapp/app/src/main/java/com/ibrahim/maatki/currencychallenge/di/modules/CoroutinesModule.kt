package com.ibrahim.maatki.currencychallenge.di.modules

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import com.ibrahim.maatki.currencychallenge.di.qualifier.DefaultDispatcher
import com.ibrahim.maatki.currencychallenge.di.qualifier.IoDispatcher
import com.ibrahim.maatki.currencychallenge.di.qualifier.MainDispatcher

@Module
object CoroutinesModule {

    @DefaultDispatcher
    @JvmStatic
    @Provides
    fun providesDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default

    @IoDispatcher
    @JvmStatic
    @Provides
    fun providesIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @MainDispatcher
    @JvmStatic
    @Provides
    fun providesMainDispatcher(): CoroutineDispatcher = Dispatchers.Main
}
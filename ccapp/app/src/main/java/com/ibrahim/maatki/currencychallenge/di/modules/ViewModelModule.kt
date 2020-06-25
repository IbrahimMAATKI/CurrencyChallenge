package com.ibrahim.maatki.currencychallenge.di.modules

import androidx.lifecycle.ViewModelProvider
import com.ibrahim.maatki.currencychallenge.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
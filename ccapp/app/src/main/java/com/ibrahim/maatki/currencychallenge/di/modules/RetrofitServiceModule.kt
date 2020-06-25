package com.ibrahim.maatki.currencychallenge.di.modules

import com.zedney.cityguide.data.advertisements.AdvertisementsRetrofitService
import com.zedney.cityguide.data.companies.CompaniesRetrofitService
import com.zedney.cityguide.data.constants.ConstantsRetrofitService
import com.zedney.cityguide.data.news.NewsRetrofitService
import com.zedney.cityguide.data.notifications.NotificationsRetrofitService
import com.zedney.cityguide.data.user.UserRetrofitService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RetrofitServiceModule {

    @Provides
    @Singleton
    fun userRetrofitService(retrofit: Retrofit): UserRetrofitService {
        return retrofit.create(UserRetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun advertisementsRetrofitService(retrofit: Retrofit): AdvertisementsRetrofitService {
        return retrofit.create(AdvertisementsRetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun companiesRetrofitService(retrofit: Retrofit): CompaniesRetrofitService {
        return retrofit.create(CompaniesRetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun constantsRetrofitService(retrofit: Retrofit): ConstantsRetrofitService {
        return retrofit.create(ConstantsRetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun newsRetrofitService(retrofit: Retrofit): NewsRetrofitService {
        return retrofit.create(NewsRetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun notificationsRetrofitService(retrofit: Retrofit): NotificationsRetrofitService {
        return retrofit.create(NotificationsRetrofitService::class.java)
    }

}
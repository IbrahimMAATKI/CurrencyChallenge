package com.ibrahim.maatki.currencychallenge.di.modules


import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.zedney.cityguide.communs.ApiEndpoint
import com.zedney.cityguide.communs.Session
import com.zedney.cityguide.communs.util.LocaleUtil
import com.zedney.cityguide.data.commons.ApiErrorResponse
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import com.zedney.cityguide.communs.AuthHeaderInterceptor
import java.io.IOException
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return logging
    }

    @Provides
    @Singleton
    fun authHeaderInterceptor(session: Session?): AuthHeaderInterceptor {
        return AuthHeaderInterceptor(session!!)
    }

    @Provides
    @Singleton
    fun provideInterceptor(localeUtil: LocaleUtil): Interceptor {
        return object : Interceptor {
            @Throws(IOException::class)
            override fun intercept(chain: Interceptor.Chain): Response {
                val request =
                    chain.request().newBuilder().addHeader("lang", localeUtil.getLocale()!!).build()
                return chain.proceed(request)
            }
        }
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor?,
        languageInterceptor: Interceptor?,
        authHeaderInterceptor: AuthHeaderInterceptor?
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .writeTimeout(1, TimeUnit.MINUTES)
            .addInterceptor(loggingInterceptor!!)
            .addInterceptor(languageInterceptor!!)
            .addInterceptor(authHeaderInterceptor!!)
            .build()
    }

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

    }

    @Provides
    @Singleton
    fun provideErrorResponseBodyConverter(retrofit: Retrofit): Converter<ResponseBody, ApiErrorResponse> {
        return retrofit.responseBodyConverter(ApiErrorResponse::class.java, arrayOfNulls(0))
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        apiEndpoint: ApiEndpoint,
        moshi: Moshi
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(apiEndpoint.apiUrl)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okHttpClient)
            .build()
    }
}
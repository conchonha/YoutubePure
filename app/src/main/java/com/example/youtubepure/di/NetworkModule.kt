package com.example.youtubepure.di

import com.example.youtubepure.utils.Const
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Singleton
    @Provides
    fun providesHttpLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Singleton
    @Provides
    fun providesOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }

//    @Provides
//    @Singleton
//    fun provideApiServices(retrofit: Retrofit): ApiServices {
//        return retrofit.create(ApiServices::class.java)
//    }

//    @Provides
//    @Singleton
//    fun provideAccountRepository(
//        apiServices: ApiServices,
//        sharePrefs: SharePrefs
//    ): AccountRepository = AccountRepository(apiServices, sharePrefs)
//
//    @Provides
//    @Singleton
//    fun providePlaceRepository(apiServices: ApiServices) = PlaceRepository(apiServices)
//
//    @Provides
//    @Singleton
//    fun provideMenuRepository(apiServices: ApiServices) = MenuRepository(apiServices)
}
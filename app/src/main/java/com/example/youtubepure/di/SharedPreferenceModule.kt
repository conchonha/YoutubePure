package com.example.youtubepure.di

import android.content.Context
import android.content.SharedPreferences
import com.example.youtubepure.utils.Const
import com.example.youtubepure.utils.SharePrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SharedPreferenceModule {
    @Provides
    @Singleton
    fun provideSharePreference(@ApplicationContext context: Context): SharedPreferences =
        context.getSharedPreferences(Const.NAME_SHARE_PREFS, Context.MODE_PRIVATE)

    @Provides
    @Singleton
    fun provideEditor(sharedPreferences: SharedPreferences): SharedPreferences.Editor =
        sharedPreferences.edit()

    @Provides
    @Singleton
    fun provideSharePrefs(
        sharedPreferences: SharedPreferences,
        editor: SharedPreferences.Editor
    ): SharePrefs = SharePrefs(sharedPreferences,editor)
}
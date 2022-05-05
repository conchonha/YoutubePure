package com.example.youtubepure.ui.myvideo.viewmodels

import android.app.Application
import com.sangtb.androidlibrary.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyVideoViewModel @Inject constructor(application: Application): BaseViewModel(application) {
}
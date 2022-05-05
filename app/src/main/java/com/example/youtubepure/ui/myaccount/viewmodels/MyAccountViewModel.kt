package com.example.youtubepure.ui.myaccount.viewmodels

import android.app.Application
import com.sangtb.androidlibrary.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyAccountViewModel @Inject constructor(application: Application): BaseViewModel(application) {
}
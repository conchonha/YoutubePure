package com.example.youtubepure.ui.myvideo.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import com.example.youtubepure.R
import com.example.youtubepure.databinding.FragmentMyVideoBinding
import com.example.youtubepure.ui.myvideo.viewmodels.MyVideoViewModel
import com.sangtb.androidlibrary.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyVideoFragment : BaseFragment<FragmentMyVideoBinding, MyVideoViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_my_video
    override val viewModel: MyVideoViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("SangTB", "onViewCreated: MyVideoFragment")
    }
}
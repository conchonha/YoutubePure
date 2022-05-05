package com.example.youtubepure.ui.myaccount.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import com.example.youtubepure.R
import com.example.youtubepure.databinding.FragmentMyAccountBinding
import com.example.youtubepure.ui.myaccount.viewmodels.MyAccountViewModel
import com.sangtb.androidlibrary.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyAccountFragment : BaseFragment<FragmentMyAccountBinding, MyAccountViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_my_account
    override val viewModel: MyAccountViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("SangTB", "onViewCreated: MyAccountFragment")
    }
}
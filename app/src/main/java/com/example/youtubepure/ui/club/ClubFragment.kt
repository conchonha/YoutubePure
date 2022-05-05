package com.example.youtubepure.ui.club

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import com.example.youtubepure.R
import com.example.youtubepure.databinding.FragmentClubBinding
import com.sangtb.androidlibrary.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClubFragment : BaseFragment<FragmentClubBinding,ClubViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_club
    override val viewModel: ClubViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("SangTB", "onViewCreated: ClubFragment")
    }
}
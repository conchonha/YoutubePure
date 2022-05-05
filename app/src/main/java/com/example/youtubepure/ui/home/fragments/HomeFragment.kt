package com.example.youtubepure.ui.home.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import com.example.youtubepure.R
import com.example.youtubepure.data.YoutubeEntity
import com.sangtb.androidlibrary.base.BaseFragment
import com.example.youtubepure.databinding.FragmentHomeBinding
import com.example.youtubepure.ui.adapter.AdapterViewpagerHome
import com.example.youtubepure.ui.home.viewmodels.HomeViewModel
import dagger.Module
import dagger.hilt.android.AndroidEntryPoint
import java.time.LocalDateTime
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_home
    override val viewModel: HomeViewModel by activityViewModels()

    @Inject
    lateinit var pagerAdapter: AdapterViewpagerHome

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pagerAdapter.submitHashMap(
            hashMapOf(
                0 to listOf(
                    YoutubeEntity(
                        image = "https://tackexinh.com/wp-content/uploads/2021/04/hinh-anh-dep-002.jpg",
                        date = LocalDateTime.now().toString(),
                        title = "SangDepTrai",
                        "SangDepTrai"
                    )
                ),
                1 to listOf(
                    YoutubeEntity(
                        image = "https://tackexinh.com/wp-content/uploads/2021/04/hinh-anh-dep-002.jpg",
                        date = LocalDateTime.now().toString(),
                        title = "SangDepTrai",
                        "SangDepTrai"
                    )
                ),
                2 to listOf(
                    YoutubeEntity(
                        image = "https://tackexinh.com/wp-content/uploads/2021/04/hinh-anh-dep-002.jpg",
                        date = LocalDateTime.now().toString(),
                        title = "SangDepTrai",
                        "SangDepTrai"
                    )
                )
            )
        )
        binding.viewPagerHome.adapter = pagerAdapter
        pagerAdapter.notifyDataSetChanged()
    }
}
package com.example.youtubepure.ui.main

import android.os.Bundle
import androidx.navigation.ui.setupWithNavController
import com.example.youtubepure.R
import com.example.youtubepure.base.BaseActivity
import com.example.youtubepure.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val layoutId: Int
        get() = R.layout.activity_main
    override val fragmentContainerView: Int
        get() = R.id.mainContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.bottomNavigationView.apply {
            setupWithNavController(controller)
            background = null
        }
    }
}
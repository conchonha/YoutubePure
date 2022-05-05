package com.example.youtubepure.ui.adapter;

import android.annotation.SuppressLint
import android.provider.CalendarContract
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubepure.R
import com.example.youtubepure.app.MyApplication
import com.example.youtubepure.data.YoutubeEntity
import com.example.youtubepure.databinding.LayoutItemRvHomeBinding
import com.example.youtubepure.databinding.LayoutViewPagerBinding
import com.example.youtubepure.ui.home.fragments.HomeFragment
import com.example.youtubepure.ui.home.viewmodels.HomeViewModel
import com.sangtb.androidlibrary.base.BaseRecyclerViewAdapter
import dagger.Component
import dagger.Provides
import java.time.LocalDateTime
import javax.inject.Inject
import javax.inject.Singleton

/*
    Copyright © 2022 UITS CO.,LTD
    Created by SangTB on 4/22/2022
*/

@Singleton
class AdapterViewpagerHome @Inject constructor() :
    RecyclerView.Adapter<AdapterViewpagerHome.ViewHolderViewPager>() {
    private lateinit var listItems: HashMap<Int, List<YoutubeEntity>>
    var listener: ((View, YoutubeEntity, Int) -> Unit)? = null

    fun submitHashMap(list: HashMap<Int, List<YoutubeEntity>>) {
        listItems = list
        notifyDataSetChanged()
    }

    inner class ViewHolderViewPager(private val binding: LayoutViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val adapter by lazy { AdapterItemsViewpager() }

        fun binData(list: List<YoutubeEntity>?) {
            list?.let {

                listener = adapter.listener
                binding.recyclerViewpager.adapter = adapter
                adapter.updateItems(it.toMutableList())
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderViewPager {
        return ViewHolderViewPager(
            LayoutViewPagerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolderViewPager, position: Int) {
        holder.binData(listItems[position])
    }

    override fun getItemCount() = listItems.size

    class AdapterItemsViewpager :
        BaseRecyclerViewAdapter<YoutubeEntity, LayoutItemRvHomeBinding>() {
        override val layoutId: Int
            get() = R.layout.layout_item_rv_home

        override fun onBindViewHolder(
            holder: BaseViewHolder<LayoutItemRvHomeBinding>,
            position: Int
        ) {

        }
    }
}





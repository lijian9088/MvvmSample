package com.lyz.lyzmvvmsample

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.lyz.lyzmvvmsample.base.BaseAdaptScreenActivity
import com.lyz.lyzmvvmsample.databinding.ActivityMainBinding
import com.lyz.lyzmvvmsample.network.NetworkConstants
import okhttp3.*
import java.io.IOException

class MainActivity : BaseAdaptScreenActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        initView()
        initData()
        initEvent()

    }

    private fun initView() {
        val navController = findNavController(R.id.fragment)
        //toolbar
        val config = AppBarConfiguration.Builder(binding.bottomNavigationView.menu).build()
        NavigationUI.setupWithNavController(binding.toolBar, navController, config)
        //bottomNav
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)

    }

    private fun initData() {

    }

    private fun initEvent() {

    }

}
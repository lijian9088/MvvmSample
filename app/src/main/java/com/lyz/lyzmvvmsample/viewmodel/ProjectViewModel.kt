package com.lyz.lyzmvvmsample.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.lyz.lyzmvvmsample.R

/**
 * @author mac
 * @create 2021/04/30
 * @Describe
 */
class ProjectViewModel : ViewModel() {

    fun clickProject(view:View){
        view.findNavController().navigate(R.id.secondFragment)
    }

}
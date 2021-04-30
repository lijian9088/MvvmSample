package com.lyz.lyzmvvmsample.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.lyz.lyzmvvmsample.R
import com.lyz.lyzmvvmsample.base.BaseFragment
import com.lyz.lyzmvvmsample.databinding.FragmentProjectBinding
import com.lyz.lyzmvvmsample.viewmodel.ProjectViewModel

/**
 * @author mac
 * @create 2021/04/28
 * @Describe
 */
class ProjectFragment : BaseFragment() {

    lateinit var binding:FragmentProjectBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_project,
            container,
            false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val viewModel :ProjectViewModel by viewModels()
//        val viewModel = ViewModelProvider(this).get<ProjectViewModel>()
        binding.vm = viewModel
        binding.lifecycleOwner = this
    }

}
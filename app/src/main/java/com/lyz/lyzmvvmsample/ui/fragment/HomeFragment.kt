package com.lyz.lyzmvvmsample.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blankj.utilcode.util.GsonUtils
import com.google.gson.Gson
import com.lyz.lyzmvvmsample.R
import com.lyz.lyzmvvmsample.base.BaseFragment
import com.lyz.lyzmvvmsample.bean.BannerKtData
import com.lyz.lyzmvvmsample.network.NetworkConstants
import com.stx.xhb.androidx.XBanner
import okhttp3.*
import java.io.IOException

/**
 * @author mac
 * @create 2021/04/12
 * @Describe
 */
class HomeFragment : BaseFragment() {

    private lateinit var xBanner: XBanner
    private lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
        initData()

    }

    private fun initView(view: View) {
        xBanner = view.findViewById(R.id.xBanner)
        rv = view.findViewById(R.id.recyclerView)

    }

    private fun initData() {
        val okHttpClient = OkHttpClient()
        val request = Request.Builder().url(NetworkConstants.BASE_URL + "banner/json")
            .build()

        okHttpClient.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body
                body?.string().apply {
                    println("string:$this")
                    val data = GsonUtils.fromJson(this, BannerKtData::class.java)
                    val list = data.data

                }
            }
        })
    }

}
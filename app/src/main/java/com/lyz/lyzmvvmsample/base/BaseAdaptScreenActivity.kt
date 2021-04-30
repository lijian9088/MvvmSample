package com.lyz.lyzmvvmsample.base

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.AdaptScreenUtils
import com.blankj.utilcode.util.BarUtils

/**
 * @author mac
 * @create 2021/04/06
 * @Describe
 */
open class BaseAdaptScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getResources(): Resources {
        if (willAdaptScreen()) {
            return AdaptScreenUtils.adaptWidth(super.getResources(), 1080)
        } else {
            return AdaptScreenUtils.closeAdapt(super.getResources())
        }
    }

    open fun willAdaptScreen(): Boolean {
        return true
    }

}
package com.lyz.lyzmvvmsample

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.blankj.utilcode.util.LogUtils

/**
 * @author mac
 * @create 2021/04/06
 * @Describe
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        ProcessLifecycleOwner.get().lifecycle.addObserver(object : LifecycleObserver {

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            fun onAppForeground(){
                LogUtils.w("ApplicationObserver: app moved to foreground")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            fun onAppBackground(){
                LogUtils.w("ApplicationObserver: app moved to background")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            fun onAppCreate(){
                LogUtils.w("ApplicationObserver: app create")
            }

        })
    }

}
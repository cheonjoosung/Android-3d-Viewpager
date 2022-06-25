package com.example.viewpager_3d

import android.util.Log

object LogUtils {

    var TAG: String = LogUtils::class.java.simpleName

    fun loge(message: String) {
        Log.e(TAG, message)
    }
}
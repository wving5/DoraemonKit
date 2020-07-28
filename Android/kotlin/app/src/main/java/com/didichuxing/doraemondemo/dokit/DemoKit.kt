package com.didichuxing.doraemondemo.dokit

import android.content.Context
import com.didichuxing.doraemondemo.R
import com.didichuxing.doraemonkit.kit.AbstractKit
import com.didichuxing.doraemonkit.kit.core.DokitIntent
import com.didichuxing.doraemonkit.kit.core.DokitViewManager

/**
 * ================================================
 * 作    者：jint（金台）
 * 版    本：1.0
 * 创建日期：2019-09-24-15:48
 * 描    述：kit demo
 * 修订历史：
 * ================================================
 */
class DemoKit : AbstractKit() {

    override val name: Int
        get() = R.string.dk_kit_demo
    override val icon: Int
        get() = R.mipmap.dk_sys_info

    override fun onClick(context: Context?) {
        DokitViewManager.instance.attach(DokitIntent(DemoDokitView::class.java))
    }

    override fun onAppInit(context: Context?) {
    }

}
package com.didichuxing.doraemonkit.aop.bigimg.glide

import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

/**
 * ================================================
 * 作    者：jint（金台）
 * 版    本：1.0
 * 创建日期：2020/3/20-18:23
 * 描    述：
 * 修订历史：
 * ================================================
 */
class DokitGlideRequestListener<R> : RequestListener<R> {
    override fun onLoadFailed(e: GlideException?, model: Any, target: Target<R>, isFirstResource: Boolean): Boolean {
        return false
    }

    override fun onResourceReady(resource: R, model: Any, target: Target<R>, dataSource: DataSource, isFirstResource: Boolean): Boolean {
        //TODO("功能待实现")
//        try {
//            if (PerformanceSpInfoConfig.isLargeImgOpen()) {
//                val bitmap: Bitmap
//                if (resource is Bitmap) {
//                    bitmap = resource
//                    val imgSize = ConvertUtils.byte2MemorySize(bitmap.byteCount.toLong(), MemoryConstants.MB)
//                    LargePictureManager.getInstance().saveImageInfo(model.toString(), imgSize, bitmap.width, bitmap.height, "Glide")
//                } else if (resource is BitmapDrawable) {
//                    bitmap = ImageUtils.drawable2Bitmap(resource as BitmapDrawable)
//                    val imgSize = ConvertUtils.byte2MemorySize(bitmap.byteCount.toLong(), MemoryConstants.MB)
//                    LargePictureManager.getInstance().saveImageInfo(model.toString(), imgSize, bitmap.width, bitmap.height, "Glide")
//                }
//            }
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
        return false
    }

    companion object {
        private const val TAG = "DokitGlideListener"
    }
}
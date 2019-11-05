package com.github.oky2abbas.king.file

import android.content.Context
import android.graphics.Bitmap
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream

fun Bitmap.toImage(context: Context): File {

    val f = File(context.cacheDir, "avatar.webp")
    if (f.exists()) f.delete()
    f.createNewFile()

    val bos = ByteArrayOutputStream()

    val maxW = if (this.width > 500 && this.height > 500)
        500 else this.width
    val maxH = if (this.height > 500 && this.height > 500)
        500 else this.height

    Bitmap.createScaledBitmap(this, maxW, maxH, true)
        .compress(Bitmap.CompressFormat.WEBP, 90, bos)

    val bitmapByte = bos.toByteArray()

    val fos = FileOutputStream(f)
    fos.write(bitmapByte)
    fos.flush()
    fos.close()

    return f
}

package com.example.interstellar.misc

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes


//region * * * * * ViewGroup * * * * *

fun ViewGroup.inflate(@LayoutRes layout: Int): View {
    return LayoutInflater.from(context).inflate(layout, this, false)
}

//endregion

//region * * * * * String  ****
fun String.superName() : String = "$this you are super"

fun String.toUpperCamelCase() : String {
    return first().toUpperCase() + toLowerCase();
}

//endregion

fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

fun Int.toDp(): Int = (this / Resources.getSystem().displayMetrics.density).toInt()
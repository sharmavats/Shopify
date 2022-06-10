package com.android.shopify.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

//MS for my shopify
//ediText component so we don't have to develop again and again
class MSEditText(context: Context, attrs: AttributeSet): AppCompatEditText(context,attrs) {

    init {
        applyFont()
    }
    private fun applyFont(){
        val typeface: Typeface =
        Typeface.createFromAsset(context.assets,"bold.ttf")
        setTypeface(typeface)
    }
}
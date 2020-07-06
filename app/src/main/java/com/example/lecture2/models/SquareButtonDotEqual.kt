package com.example.lecture2.models

import android.content.Context
import android.util.AttributeSet
import androidx.core.view.marginRight

class SquareButtonDotEqual : androidx.appcompat.widget.AppCompatButton {
    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val requestedWidth = MeasureSpec.getSize(widthMeasureSpec) - marginRight/2
        val requestedWidthMode = MeasureSpec.getMode(widthMeasureSpec)

        val requestedHeight = MeasureSpec.getSize(heightMeasureSpec)
        val requestedHeightMode = MeasureSpec.getMode(heightMeasureSpec)

        val desiredWidth = suggestedMinimumWidth + paddingLeft + paddingRight
        val desiredHeight = suggestedMinimumHeight + paddingTop + paddingBottom

        val width = when (requestedWidthMode) {
            MeasureSpec.EXACTLY -> requestedWidth.also { println("SquareButtonDotEqual: Exactly") }
            MeasureSpec.UNSPECIFIED -> desiredWidth.also { println("SquareButtonDotEqual: UNSPECIFIED") }
            else -> Math.min(requestedWidth, desiredWidth).also { println("SquareButtonDotEqual: AT-MOST") }
        }

//        val height = when (requestedHeightMode) {
//            MeasureSpec.EXACTLY -> requestedHeight.also { println("Exactly") }
//            MeasureSpec.UNSPECIFIED -> desiredHeight.also { println("UNSPECIFIED") }
//            else -> Math.min(requestedHeight, desiredHeight).also{println("AT-MOST")}
//        }

        setMeasuredDimension(width, width)
//        setMeasuredDimension(measuredWidth, measuredWidth)
    }
}
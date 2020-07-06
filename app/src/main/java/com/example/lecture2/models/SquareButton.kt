package com.example.lecture2.models

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet

class SquareButton : androidx.appcompat.widget.AppCompatButton {
    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}


    override fun onFinishInflate() {
        super.onFinishInflate()
    }


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val requestedWidth = MeasureSpec.getSize(widthMeasureSpec)
        val requestedWidthMode = MeasureSpec.getMode(widthMeasureSpec)

        val requestedHeight = MeasureSpec.getSize(heightMeasureSpec)
        val requestedHeightMode = MeasureSpec.getMode(heightMeasureSpec)

        val desiredWidth = suggestedMinimumWidth + paddingLeft + paddingRight
        val desiredHeight = suggestedMinimumHeight + paddingTop + paddingBottom

        val width = when (requestedWidthMode) {
            MeasureSpec.EXACTLY -> requestedWidth.also { println("SquareButton: Exactly") }
            MeasureSpec.UNSPECIFIED -> desiredWidth.also { println("SquareButton: UNSPECIFIED") }
            else -> Math.min(requestedWidth, desiredWidth).also { println("SquareButton: AT-MOST") }
        }

//        val height = when (requestedHeightMode) {
//            MeasureSpec.EXACTLY -> requestedHeight.also { println("Exactly") }
//            MeasureSpec.UNSPECIFIED -> desiredHeight.also { println("UNSPECIFIED") }
//            else -> Math.min(requestedHeight, desiredHeight).also { println("AT-MOST") }
//        }

        setMeasuredDimension(width, width)
//        setMeasuredDimension(measuredWidth, measuredWidth)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }
}
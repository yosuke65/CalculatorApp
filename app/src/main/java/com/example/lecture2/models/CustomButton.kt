package com.example.lecture2.models

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import androidx.core.view.marginRight


class CustomButton : androidx.appcompat.widget.AppCompatButton {
    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onFinishInflate() {
        Log.d("demo5", "onFinishInflate")
        super.onFinishInflate()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d("demo5", "onAttachedToWindow")

    }
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        Log.d("demo5", "onMeasure")

//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val requestedWidth = MeasureSpec.getSize(widthMeasureSpec)
        val requestedWidthMode = MeasureSpec.getMode(widthMeasureSpec)

        val requestedHeight = MeasureSpec.getSize(heightMeasureSpec)
        val requestedHeightMode = MeasureSpec.getMode(heightMeasureSpec)

        val desiredWidth = suggestedMinimumWidth + paddingLeft + paddingRight
        val desiredHeight = suggestedMinimumHeight + paddingTop + paddingBottom

        val width = when (requestedWidthMode) {
            MeasureSpec.EXACTLY -> requestedWidth.also { println("CustomButton: Exactly") }
            MeasureSpec.UNSPECIFIED -> desiredWidth.also { println("CustomButton: UNSPECIFIED") }
            else -> Math.min(requestedWidth, desiredWidth).also { println("CustomButton: AT-MOST") }
        }

//        val height = when (requestedHeightMode) {
//            MeasureSpec.EXACTLY -> requestedHeight.also { println("Exactly") }
//            MeasureSpec.UNSPECIFIED -> desiredHeight.also { println("UNSPECIFIED") }
//            else -> Math.min(requestedHeight, desiredHeight).also { println("AT-MOST") }
//        }


        setMeasuredDimension(width + marginRight, width/2)

//        setMeasuredDimension(measuredWidth, measuredWidth/2)

    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.d("demo5", "onSizedChanged")

    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.d("demo5", "onLayout")

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.d("demo5", "onDraw")

    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.d("demo5", "onDetachedFromWindow")

    }

    override fun invalidate() {
        super.invalidate()
        Log.d("demo5", "invalidate")

    }

    override fun requestLayout() {
        super.requestLayout()
        Log.d("demo5", "requestLayout")

    }

}
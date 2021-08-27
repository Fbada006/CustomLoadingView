package com.example.customloadingview.customloadingview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import com.example.customloadingview.R

class LoadingView : View {
    private lateinit var paint: Paint
    private var circleRadius = 100F

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, @Nullable attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    private fun init(context: Context, attributeSet: AttributeSet?) {
        paint = Paint().apply {
            color = ContextCompat.getColor(context, R.color.teal_700)
            style = Paint.Style.STROKE
            strokeWidth = 20F
            isAntiAlias = true
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawCircle(width / 2F, height / 2F, circleRadius, paint)
    }
}
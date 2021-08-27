package com.example.customloadingview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.customloadingview.customloadingview.LoadingView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loadingView = findViewById<LoadingView>(R.id.loadingView)
        val button = findViewById<Button>(R.id.startStopAnimation)
        button.setOnClickListener {
            if (button.text == "Load") {
                loadingView.showLoading()
            } else {
                loadingView.hideLoading()
            }
            button.text = "Stop load"
        }
    }
}
package com.example.menuhw
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SittingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sitting)

        val textviw: TextView = findViewById(R.id.textView)
        textviw.setText("settings")

    }
}
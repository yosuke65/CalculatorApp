package com.example.lecture2.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.lecture2.R
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Log.d("demo3", "Home OnCreate")

        init()
    }

    private fun init(){
        var email =  intent.getStringExtra("EMAIL")
        welcome_text.text = "Welcome " + email
    }
}
package com.example.lecture2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.lecture2.R
import com.example.lecture2.fragments.MyFirstFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("demo4", "Main onCreate")
        init()
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        Log.v("demo4", "Main onAttachFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.v("demo4", "Main: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("demo4", "Main: onResume")

    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.v("demo4", "Main: onAttachedToWindow")

    }

    override fun onPause() {
        super.onPause()
        Log.v("demo4", "Main: onPause")

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.v("demo4", "Main: onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.v("demo4", "Main: onRestoreInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.v("demo4", "Main: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("demo4", "Main: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("demo4", "Main: onDstroy")

    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.v("demo4", "Main: onDetachedFromWindow")

    }

    private fun init() {

        supportFragmentManager.beginTransaction().add(
            R.id.fragment_container,
            MyFirstFragment()
        ).commit()
    }

}
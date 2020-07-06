package com.example.lecture2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.lecture2.R
import com.example.lecture2.models.Customer
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.v("demo4", "Second onCreate")


        var customer = intent.getParcelableExtra(Customer.KEY) as Customer

        text_view_name.text = customer.name
        text_view_email.text = customer.email
        text_view_mobile.text = customer.mobile
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        Log.v("demo4", "Second onAttachFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.v("demo4", "Second: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("demo4", "Second: onResume")

    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.v("demo4", "Second: onAttachedToWindow")

    }



    override fun onPause() {
        super.onPause()
        Log.v("demo4", "Second: onPause")

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.v("demo4", "Second: onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.v("demo4", "Second: onRestoreInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.v("demo4", "Second: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("demo4", "Second: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("demo4", "Second: onDstroy")

    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.v("demo4", "Second: onDetachedFromWindow")

    }
}

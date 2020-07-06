package com.example.lecture2.activities
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.lecture2.R
import com.example.lecture2.models.Customer
import kotlinx.android.synthetic.main.activity_first.*



class FirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.v("demo4", "First onCreate")
        init()
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        Log.v("demo4", "First onAttachFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.v("demo4", "First: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("demo4", "First: onResume")

    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.v("demo4", "First: onAttachedToWindow")

    }



    override fun onPause() {
        super.onPause()
        Log.v("demo4", "First: onPause")

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.v("demo4", "First: onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.v("demo4", "First: onRestoreInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.v("demo4", "First: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("demo4", "First: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("demo4", "First: onDstroy")

    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.v("demo4", "First: onDetachedFromWindow")

    }

    private fun init() {

//        button_send.setOnClickListener{
//            var name = edit_text_name.text.toString()
//            var email = edit_text_email.text.toString()
//            var demoFragment = DemoFragment.newInstance(name,email)
//            supportFragmentManager.beginTransaction().add(R.id.fragment_container, demoFragment)
//                .commit()
//        }

        button_send.setOnClickListener {
            var name = edit_text_name.text.toString()
            var email = edit_text_email.text.toString()
            var mobile = edit_text_mobile.text.toString()

            var customer = Customer(name,email,mobile)

            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Customer.KEY,customer)
            startActivity(intent)

        }

    }
}


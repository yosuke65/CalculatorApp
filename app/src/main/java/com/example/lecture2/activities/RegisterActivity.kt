package com.example.lecture2.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lecture2.R
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.edit_text_email
import kotlinx.android.synthetic.main.activity_register.edit_text_name
import kotlinx.android.synthetic.main.activity_register.edit_text_password

class RegisterActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        Log.d("demo3", "Register OnCreate")

        init()
    }

    private fun init(){

        register_account.setOnClickListener {
            if(validateName()){
                if(validateEmail())
                    if(validatePassword()){
                        var password = edit_text_password.text.toString()
                        var email = edit_text_email.text.toString()
                        val intent = Intent(this, LoginActivity::class.java)
                        intent.putExtra("KEY_PASSWORD", password)
                        intent.putExtra("KEY_EMAIL", email)
                        startActivity(intent)
                    }
            }

        }
        already_registered.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validatePassword():Boolean{
        var password = edit_text_password.text
        if(password.isNullOrEmpty()) {
            Toast.makeText(applicationContext, "Enter your password", Toast.LENGTH_SHORT).show()
            return false
        }else if (password.length < 5){
            Toast.makeText(applicationContext, "Password must contain at least 6 characters", Toast.LENGTH_SHORT).show()
            return false
        }else if(!password.toString().contains(Regex("[A-Z]+"))){
            Toast.makeText(applicationContext, "Password must contain at least one capital letter", Toast.LENGTH_SHORT).show()
            return false
        }else if(!password.toString().contains(Regex("\\d+"))){
            Toast.makeText(applicationContext, "Password must contain at least one digit from 0-9", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }

    private fun validateEmail():Boolean{
        var email = edit_text_email.text
        if(email.isNullOrEmpty()){
            Toast.makeText(applicationContext,"Enter your email", Toast.LENGTH_SHORT).show()
            return false
        }else if (!email.contains('@')){
            Toast.makeText(applicationContext,"Email must contain @", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    private fun validateName():Boolean{
        var name = edit_text_name.text
        if(name.isNullOrEmpty()) {
            Toast.makeText(applicationContext, "Enter your name", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

}
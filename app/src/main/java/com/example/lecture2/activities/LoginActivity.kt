package com.example.lecture2.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lecture2.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.edit_text_email
import kotlinx.android.synthetic.main.activity_login.edit_text_password

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.d("demo3", "Login OnCreate")

        init()
    }

    private fun init(){

        var emailLogin:String? = intent.getStringExtra("KEY_EMAIL")
        var passwordLogin:String? = intent.getStringExtra("KEY_PASSWORD")
            Log.d("demo3",emailLogin?:"Email is Null")
            Log.d("demo3",passwordLogin?:"Password is Null")
            if(!emailLogin.isNullOrEmpty()){
                edit_text_email.setText(emailLogin)
                Log.d("demo3","setText: email")
            }
            if(!passwordLogin.isNullOrEmpty()){
//                edit_text_password.transformationMethod = PasswordTransformationMethod.getInstance()
                edit_text_password.setText(passwordLogin)
                Log.d("demo3","setText: password")

            }

            login_account.setOnClickListener {
                if(validateEmail()){
                    if(validatePassword()){
                        var email = edit_text_email.text.toString()
                        val intent = Intent(this, HomeActivity::class.java)
                        intent.putExtra("EMAIL", email)
                        startActivity(intent)
                    }
                }

            }

            new_user.setOnClickListener {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
        }



    private fun validateEmail():Boolean{
        var email = edit_text_email.text
        if(email.isNullOrEmpty()) {
            Toast.makeText(applicationContext, "Enter your email", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    private fun validatePassword():Boolean{
        var password = edit_text_password.text
        if(password.isNullOrEmpty()) {
            Toast.makeText(applicationContext, "Enter your password", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }





}
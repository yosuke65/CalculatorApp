package com.example.lecture2.activities

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.lecture2.R
import com.example.lecture2.models.Calculator
import kotlinx.android.synthetic.main.activity_calculator.*
import java.lang.StringBuilder

class CalculatorActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("demo5", "Main onCreate start")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Log.v("demo5", "Main onCreate end")
        init()
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        Log.v("demo5", "Main onAttachFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.v("demo5", "Main: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("demo5", "Main: onResume")

    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.v("demo5", "Main: onAttachedToWindow")

    }

    override fun onPause() {
        super.onPause()
        Log.v("demo5", "Main: onPause")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.v("demo5", "Main: onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.v("demo5", "Main: onRestoreInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.v("demo5", "Main: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("demo5", "Main: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("demo5", "Main: onDstroy")

    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.v("demo5", "Main: onDetachedFromWindow")

    }

    private fun init() {
        button_clear.setOnClickListener(this)
        button_plus_minus.setOnClickListener(this)
        button_percent.setOnClickListener(this)
        button_div.setOnClickListener(this)
        button_mult.setOnClickListener(this)
        button_minus.setOnClickListener(this)
        button_sum.setOnClickListener(this)
        button_point.setOnClickListener(this)
        button_result.setOnClickListener(this)
        button_one.setOnClickListener(this)
        button_two.setOnClickListener(this)
        button_three.setOnClickListener(this)
        button_four.setOnClickListener(this)
        button_five.setOnClickListener(this)
        button_six.setOnClickListener(this)
        button_seven.setOnClickListener(this)
        button_eight.setOnClickListener(this)
        button_nine.setOnClickListener(this)
        button_zero.setOnClickListener(this)
    }

    private fun buttunColorChange(prevOperator: String?, currentOperator: String?) {
        if (!prevOperator.isNullOrBlank()) {
            when (prevOperator) {
                Calculator.MINUS -> {
                    button_minus.setTextColor(Color.parseColor("#FFFFFF"))
                    button_minus.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_orange
                        )
                    )
                }
                Calculator.SUM -> {
                    button_sum.setTextColor(Color.parseColor("#FFFFFF"))
                    button_sum.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_orange
                        )
                    )
                }
                Calculator.MULTIPLY -> {
                    button_mult.setTextColor(Color.parseColor("#FFFFFF"))
                    button_mult.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_orange
                        )
                    )
                }
                Calculator.DIVIDE -> {
                    button_div.setTextColor(Color.parseColor("#FFFFFF"))
                    button_div.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_orange
                        )
                    )
                }
                else -> {
                }
            }
        }
        if (!currentOperator.isNullOrBlank()) {
            when (currentOperator) {
                Calculator.MINUS -> {
                    button_minus.setTextColor(Color.parseColor("#FFC100"))
                    button_minus.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_white
                        )
                    )
                }
                Calculator.SUM -> {
                    button_sum.setTextColor(Color.parseColor("#FFC100"))
                    button_sum.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_white
                        )
                    )
                }
                Calculator.MULTIPLY -> {
                    button_mult.setTextColor(Color.parseColor("#FFC100"))
                    button_mult.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_white
                        )
                    )
                }
                Calculator.DIVIDE -> {
                    button_div.setTextColor(Color.parseColor("#FFC100"))
                    button_div.setBackgroundDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.button_bg_round_white
                        )
                    )
                }

                else -> {
                }
            }
        }
    }

    var firstNum: StringBuilder = StringBuilder("")
    var secondNum: StringBuilder = StringBuilder("")
    var operator: String? = null

    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.button_clear -> {

                if (operator == Calculator.EQUAL) {
                    reslut_text_view.text = "0"
                    firstNum = StringBuilder("")
                    secondNum = StringBuilder("")

                } else if (!secondNum.isNullOrEmpty()) {
                    secondNum = StringBuilder("")
                    reslut_text_view.text = "0"

                } else if (!operator.isNullOrEmpty()) {
                    buttunColorChange(operator, null)
                    operator = null

                } else if (!firstNum.isNullOrEmpty()) {
                    firstNum = StringBuilder("")
                    reslut_text_view.text = "0"
                } else {
                    reslut_text_view.text = "0"
                }
            }
            R.id.button_plus_minus -> {
                if(!operator.isNullOrEmpty()){
                    if(operator == Calculator.EQUAL){
                        firstNum = StringBuilder(Calculator.reverseSign(firstNum.toString()))
                        reslut_text_view.text = firstNum

                    }
                    else if(!secondNum.isNullOrEmpty()){
                        secondNum = StringBuilder(Calculator.reverseSign(secondNum.toString()))
                        reslut_text_view.text = secondNum.toString()
                    }
                }else{
                    if(!firstNum.isNullOrEmpty()) {
                        firstNum = StringBuilder(Calculator.reverseSign(firstNum.toString()))
                        reslut_text_view.text = firstNum.toString()
                    }
                }

            }
            R.id.button_percent -> {
                if (operator == Calculator.EQUAL) {
                    reslut_text_view.text =
                        Calculator.percent(reslut_text_view.text.toString().toDouble()).toString()
                } else if (!operator.isNullOrEmpty()) {
                    if (!secondNum.isNullOrEmpty()) {
                        secondNum = StringBuilder(
                            Calculator.percent(secondNum.toString().toDouble()).toString()
                        )
                        reslut_text_view.text = secondNum.toString()
                    }
                } else {
                    if (!firstNum.isNullOrEmpty()) {
                        firstNum = StringBuilder(
                            Calculator.percent(firstNum.toString().toDouble()).toString()
                        )
                        reslut_text_view.text = firstNum.toString()
                    }
                }
            }
            R.id.button_div -> {
                if (!operator.isNullOrEmpty()) {
                    if (!secondNum.isNullOrEmpty()) {
                        reslut_text_view.text = Calculator.execute(
                            firstNum.toString(),
                            secondNum.toString(),
                            operator!!
                        )
                        firstNum = StringBuilder("")
                        firstNum = StringBuilder(reslut_text_view.text.toString())
                        secondNum = StringBuilder("")
                    }
                }
                if(!firstNum.isNullOrEmpty()){
                    buttunColorChange(operator, Calculator.DIVIDE)
                    operator = Calculator.DIVIDE
                }

            }
            R.id.button_mult -> {
                if (!operator.isNullOrEmpty()) {
                    if (!secondNum.isNullOrEmpty()) {
                        reslut_text_view.text = Calculator.execute(
                            firstNum.toString(),
                            secondNum.toString(),
                            operator!!
                        )
                        firstNum = StringBuilder("")
                        firstNum = StringBuilder(reslut_text_view.text.toString())
                        secondNum = StringBuilder("")
                    }
                }
                if(!firstNum.isNullOrEmpty()){
                    buttunColorChange(operator, Calculator.MULTIPLY)
                    operator = Calculator.MULTIPLY
                }

            }
            R.id.button_minus -> {
                if (!operator.isNullOrEmpty()) {
                    if (!secondNum.isNullOrEmpty()) {
                        reslut_text_view.text = Calculator.execute(
                            firstNum.toString(),
                            secondNum.toString(),
                            operator!!
                        )
                        firstNum = StringBuilder("")
                        firstNum = StringBuilder(reslut_text_view.text.toString())
                        secondNum = StringBuilder("")
                    }
                }
                if(!firstNum.isNullOrEmpty()){
                    buttunColorChange(operator, Calculator.MINUS)
                    operator = Calculator.MINUS
                }

            }
            R.id.button_sum -> {
                if (!operator.isNullOrEmpty()) {
                    if (!secondNum.isNullOrEmpty()) {
                        reslut_text_view.text = Calculator.execute(
                            firstNum.toString(),
                            secondNum.toString(),
                            operator!!
                        )
                        firstNum = StringBuilder("")
                        firstNum = StringBuilder(reslut_text_view.text.toString())
                        secondNum = StringBuilder("")
                    }
                }
                if(!firstNum.isNullOrEmpty()){
                    buttunColorChange(operator, Calculator.SUM)
                    operator = Calculator.SUM
                }
            }
            R.id.button_point -> {

                if (!operator.isNullOrEmpty()) {
                    if (operator == Calculator.EQUAL) {
                        reslut_text_view.text = "0."
                        firstNum = StringBuilder("0.")
                        secondNum = StringBuilder("")
                        operator = null
                    } else if (!secondNum.isNullOrEmpty()) {
                        if (!secondNum.contains('.')) {
                            secondNum.append('.')
                            reslut_text_view.text = secondNum.toString()
                        }
                    } else {
                        secondNum.append("0.")
                        reslut_text_view.text = secondNum.toString()

                    }

                } else {
                    if (!firstNum.isNullOrEmpty()) {
                        if (!firstNum.contains('.')) {
                            firstNum.append('.')
                        }
                    } else {
                        firstNum.append("0.")
                    }
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_result -> {
                if (!operator.isNullOrEmpty()) {
                    if (!firstNum.isNullOrEmpty()) {
                        if (!secondNum.isNullOrEmpty()) {
                            reslut_text_view.text = Calculator.execute(
                                firstNum.toString(),
                                secondNum.toString(),
                                operator!!
                            )
                            buttunColorChange(operator, null)
                            firstNum = StringBuilder("")
                            firstNum = StringBuilder(reslut_text_view.text.toString())
                            secondNum = StringBuilder("")
                            operator = Calculator.EQUAL
                        }
                    }

                }
            }
            R.id.button_one -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('1')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('1')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_two -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('2')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('2')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_three -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('3')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('3')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_four -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('4')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('4')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_five -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('5')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('5')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_six -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('6')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('6')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_seven -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('7')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('7')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_eight -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('8')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('8')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_nine -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('9')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('9')
                    reslut_text_view.text = firstNum.toString()
                }
            }
            R.id.button_zero -> {
                if (!operator.isNullOrEmpty() && operator != Calculator.EQUAL) {
                    secondNum.append('0')
                    reslut_text_view.text = secondNum.toString()

                } else {
                    if (operator == Calculator.EQUAL) {
                        firstNum = StringBuilder("")
                        secondNum = StringBuilder("")
                        operator = null
                    }
                    firstNum.append('0')
                    reslut_text_view.text = firstNum.toString()
                }
            }
        }
    }

}
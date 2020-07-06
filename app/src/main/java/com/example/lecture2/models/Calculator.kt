package com.example.lecture2.models

import android.util.Log
import java.lang.StringBuilder

class Calculator {
    companion object{
        const val MINUS = "minus"
        const val SUM = "sum"
        const val MULTIPLY = "multiply"
        const val DIVIDE = "divide"
        const val EQUAL = "equal"

        private fun sum(a:Double,b:Double):Double{
            return a + b
        }
        private fun subtract(a:Double,b:Double):Double{
            return a - b
        }
        private fun multiply(a:Double, b:Double):Double{
            return a * b
        }
        private fun divide(a:Double, b:Double):Double{
            return  a/b
        }
        fun percent(a:Double):Double{
            return a/100
        }
        fun reverseSign(str:String):String{
            val sb = StringBuilder(str)
            return when(sb[0]){
                '-' -> StringBuilder(str).substring(1).toString()  //str.slice(1 until str.length-1)
                else -> StringBuilder(str).insert(0,'-').toString()
            }
        }
        fun execute(x:String, y:String, operation:String):String {
            val a = x.toDouble()
            val b = y.toDouble()
            var result =  when (operation) {
                MINUS -> subtract(a, b).toString()
                SUM -> sum(a, b).toString()
                MULTIPLY -> multiply(a, b).toString()
                DIVIDE -> divide(a, b).toString()
                else -> "0"
            }

            if(result.last()=='0'){
                result = result.toDouble().toLong().toString()
            }

            return result
        }
    }
}
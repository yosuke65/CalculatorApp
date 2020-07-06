package com.example.lecture2.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lecture2.R
import kotlinx.android.synthetic.main.fragment_my_first.*


class MyFirstFragment : Fragment(), View.OnClickListener {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("demo4", "Fragment1: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("demo4", "Fragment1: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("demo4", "Fragment1: onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("demo4", "Fragment1: onActivityCreated")
        init()
    }

    override fun onStart() {
        super.onStart()
        Log.d("demo4", "Fragment1: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("demo4", "Fragment1: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("demo4", "Fragment1: onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("demo4", "Fragment1: onSaveInstanceState")

    }


    override fun onStop() {
        super.onStop()
        Log.d("demo4", "Fragment1: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("demo4", "Fragment1: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("demo4", "Fragment1: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("demo4", "Fragment1: onDetach")

    }

    fun init() {
        button1_add.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view != null) {
            Log.v("demo4", "F2 added")
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(
                    R.id.fragment_container,
                    MySecondFragment()
                )?.addToBackStack(null)?.commit()

        }
    }

}
package com.example.lecture2.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lecture2.R
import kotlinx.android.synthetic.main.fragment_my_second.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MySecondFragment : Fragment(), View.OnClickListener {

    private var param1: String? = null
    private var param2: String? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("demo4", "Fragment2: onAttach")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("demo4", "Fragment2: onCreate")
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("demo4", "Fragment2: onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("demo4", "Fragment2: onActivityCreated")
        init()

    }

    override fun onStart() {
        super.onStart()
        Log.e("demo4", "Fragment2: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("demo4", "Fragment2: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("demo4", "Fragment2: onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("demo4", "Fragment2: onSaveInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.e("demo4", "Fragment2: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("demo4", "Fragment2: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("demo4", "Fragment2: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("demo4", "Fragment2: onDetach")
    }

    fun init() {

        button2_add.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        if (view != null) {
            Log.v("demo4", "F2 added")
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(
                    R.id.fragment_container,
                    MyThirdFragment()
                )?.addToBackStack(null)?.commit()
        }

    }


}
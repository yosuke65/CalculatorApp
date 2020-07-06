package com.example.lecture2.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lecture2.R


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MyThirdFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.w("demo4", "Fragment3: onAttach")

    }

    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
        Log.w("demo4", "Fragment3: onAttachFragment")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.w("demo4", "Fragment3: onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.w("demo4", "Fragment3: onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_third, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.w("demo4", "Fragment3: onActivityCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.w("demo4", "Fragment3: onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.w("demo4", "Fragment3: onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.w("demo4", "Fragment3: onPause")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.w("demo4", "Fragment3: onSaveInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.w("demo4", "Fragment3: onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.w("demo4", "Fragment3: onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("demo4", "Fragment3: onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.w("demo4", "Fragment3: onDetach")

    }

}
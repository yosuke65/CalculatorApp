package com.example.lecture2.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lecture2.R
import kotlinx.android.synthetic.main.fragment_demo.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DemoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DemoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_demo, container, false)
        view.text_view_name.text = param1
        view.text_view_email.text = param2
        return view
    }

    companion object {

//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            DemoFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//    }
        @JvmStatic
        fun newInstance(param1: String, param2: String): DemoFragment
        {
            Log.d("demo5", "newInstance success")
            var demo = DemoFragment()
            var args = Bundle()
            args?.putString(ARG_PARAM1, param1)
            args?.putString(ARG_PARAM2, param2)
            demo.arguments = args
            return demo
        }

    }
}

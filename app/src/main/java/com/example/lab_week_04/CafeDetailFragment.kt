package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CafeDetailFragment : Fragment() {

    companion object {
        private const val ARG_CONTENT_DESC = "content_description"

        // Create a new instance of CafeDetailFragment with the description passed as an argument
        fun newInstance(contentDescription: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putString(ARG_CONTENT_DESC, contentDescription)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieve the description passed via arguments
        val contentDescription = arguments?.getString(ARG_CONTENT_DESC)

        // Find the TextView and set the description
        val textView = view.findViewById<TextView>(R.id.content_description)
        textView.text = contentDescription
    }
}

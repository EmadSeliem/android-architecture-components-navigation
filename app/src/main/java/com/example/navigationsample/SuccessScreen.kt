package com.example.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SuccessScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sucess_screen, container, false)

        /**
         * use the getArguments() method to retrieve the Bundle and use its contents.
         */
        val productName = arguments?.getString("productName")
        view.findViewById<TextView>(R.id.product_name).text =
            getString(R.string.eligible_to_buy_product, productName)
        return view
    }

}
package com.example.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * shows main screen and it is the start destination on navigation graph
 */
class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        view.findViewById<Button>(R.id.login).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        view.findViewById<Button>(R.id.continue_shopping).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_global_selectProduct)
        }
        return view
    }


}
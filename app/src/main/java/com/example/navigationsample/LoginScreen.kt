package com.example.navigationsample

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import androidx.navigation.Navigation
import androidx.navigation.findNavController


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        view.findViewById<Button>(R.id.login_btn).setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_global_selectProduct)
        }
        view.findViewById<Button>(R.id.register_btn).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_loginFragment_to_registerScreen)
        }

        view.findViewById<Button>(R.id.forgot_password).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_loginFragment_to_forgotPassword)
        }


        return view
    }


}
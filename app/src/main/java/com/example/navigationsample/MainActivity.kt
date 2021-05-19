package com.example.navigationsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * An Activity that inflates layout that has a Navigation Fragment.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
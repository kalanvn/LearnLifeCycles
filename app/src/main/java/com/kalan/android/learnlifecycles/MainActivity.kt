package com.kalan.android.learnlifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val myTag = "MainActivity" // Class scope
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val myTag = "MainActivity" // Function Scope
        val onCreateCalled = "onCreateCalled"
//        Log.i(myTag, onCreateCalled)
    }

    override fun onStart() {
        super.onStart()
//        Log.i(myTag, "onStartCalled")
    }

    override fun onResume() {
        super.onResume()

//        Log.i("MainActivity", "onResumeCalled")
    }

    override fun onPause() {
        super.onPause()

//        Log.i("MainActivity", "onPauseCalled")
    }

    override fun onStop() {
        super.onStop()

//        Log.i("MainActivity", "onStopCalled")
    }

    override fun onDestroy() {
        super.onDestroy()

//        Log.i("MainActivity", "onDestroyCalled")
    }
}
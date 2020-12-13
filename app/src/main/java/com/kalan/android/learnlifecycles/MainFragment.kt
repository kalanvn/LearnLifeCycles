package com.kalan.android.learnlifecycles

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    val TAG = "MainFragment";
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "onAttachCalled")
        if (context is MainActivity) Log.i(TAG, "attachedMainActivity")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreateCalled")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateViewCalled")
        return inflater.inflate(R.layout.fragment_main, container)
        Log.i(TAG, "onCreateViewCalledAfterReturn") //Unreachable code after return
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textViewHelloWorld).text = "Text changed"

        Log.i(TAG, "onViewCreatedCalled")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStartCalled")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResumeCalled")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPauseCalled")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStopCalled")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "oonDestroyViewCalled")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroyCalled")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetachCalled")
    }
}
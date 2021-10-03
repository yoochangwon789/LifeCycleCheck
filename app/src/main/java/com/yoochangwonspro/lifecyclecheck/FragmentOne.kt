package com.yoochangwonspro.lifecyclecheck

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne : Fragment(R.layout.fragment_one) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("LifeCycle", "fragmentOne_onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LifeCycle", "fragmentOne_onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LifeCycle", "fragmentOne_onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("LifeCycle", "fragmentOne_onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "fragmentOne_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "fragmentOne_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "fragmentOne_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "fragmentOne_onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LifeCycle", "fragmentOne_onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCycle", "fragmentOne_onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "fragmentOne_onDestroy")
    }
}
package com.yoochangwonspro.lifecyclecheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        replaceFragment(fragmentOne)

        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.oneItem -> replaceFragment(fragmentOne)
                R.id.twoItem -> replaceFragment(fragmentTwo)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }

        Log.d("LifeCycle", "Activity_onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "Activity_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "Activity_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "Activity_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "Activity_onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "Activity_onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "Activity_onDestroy")
    }
}
package com.codelabs.activityfragmentlifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.codelabs.activityfragmentlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "$COMMON_TAG: onCreate: ")

        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.add_fragment).setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment())
                .addToBackStack(null)
                .commit()

        }
        findViewById<Button>(R.id.replace_fragment).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment())
                .addToBackStack(null)
                .commit()
        }



    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$COMMON_TAG: onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$COMMON_TAG: onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$COMMON_TAG: onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$COMMON_TAG: onDestroy: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "$COMMON_TAG: onRestart: ")
    }

    override fun finish() {
        Log.d(TAG, "$COMMON_TAG: finish: ")
        super.finish()
    }

    companion object {
        const val COMMON_TAG = "Common_Tag"
        const val TAG = "MAIN_ACTIVITY_Tag"
    }
}
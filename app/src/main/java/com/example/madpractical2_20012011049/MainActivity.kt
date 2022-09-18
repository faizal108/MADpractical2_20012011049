package com.example.madpractical2_20012011049

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Tag="mainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun showMessage(msg:String){
        Log.i(Tag,msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart is called!")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart is called!")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume is called!")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop is called!")
    }
}
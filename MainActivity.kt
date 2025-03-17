package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonabc.setOnClickListener {
            textViewabc.text = "chao tat ca cac ban"




        }
        var a : Int = 5
        var b : Int = 10
        var c : Int = a + b
        Log.d("ketqua", c.toString())
        Log.d("soa", a.toString())

    }
}
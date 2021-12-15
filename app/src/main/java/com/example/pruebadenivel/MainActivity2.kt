package com.example.pruebadenivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intencion = intent
        val extrass = intencion.extras
        val nombre= extrass?.getString("extra1")
    }
}
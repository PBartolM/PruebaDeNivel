package com.example.pruebadenivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun lanzarNewPlayer (){
        val i = Intent(this,MainActivity2::class.java)
        i.putExtra("extra1","null")
        startActivity(i)
    }


}
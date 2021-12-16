package com.example.pruebadenivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener {
            val num1 = input1.text.toString().toInt()
            lanzarNewPlayer()
        }

    }
    private fun lanzarNewPlayer (){
        val i = Intent(this,MainActivity2::class.java)
        i.putExtra("extra1","null")
        startActivity(i)
    }


}
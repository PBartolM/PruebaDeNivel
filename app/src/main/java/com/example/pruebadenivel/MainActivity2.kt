package com.example.pruebadenivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intencion = intent
        val extrass = intencion.extras
        val num1= extrass?.getDouble("extra1")
        val num2= extrass?.getDouble("extra2")
        val num3= extrass?.getDouble("extra3")
        val equa=Equacion(num1!!,num2!!,num3!!)
        textViewSolucion.text=equa.resuelve()
    }
}
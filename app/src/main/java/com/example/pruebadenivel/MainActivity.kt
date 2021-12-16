package com.example.pruebadenivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Double.parseDouble

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener {
            val num1 = input1!!.text?.toString()?.let { it1 -> seguridad(it1) }
            val num2 = input2!!.text?.toString()?.let { it1 -> seguridad(it1) }
            val num3 = input3!!.text?.toString()?.let { it1 -> seguridad(it1) }
            //Los check nulls de abajo no hacen falta porque es imposible que llegen null, pero android Studio se queja
            if (num1 != null) {
                if (num2 != null) {
                    if (num3 != null) {
                        lanzarNewPlayer(num1,num2,num3)
                    }
                }
            }



        }

    }
    //esto comprueba que no entren valores nulos ni Strings que no sean numeros decimales
    fun seguridad(string:String):Double{
        var resultao=0.0
        try {
            resultao = parseDouble(string)
        } catch (e: NumberFormatException) {
            resultao = 0.0
        }
        return resultao
    }
    private fun lanzarNewPlayer (num1:Double,num2:Double,num3:Double){
        val i = Intent(this,MainActivity2::class.java)
        i.putExtra("extra1",num1)
        i.putExtra("extra2",num2)
        i.putExtra("extra3",num3)
        startActivity(i)
    }


}
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
            var num1 = input1!!.text?.toString()
            var num2 = input2!!.text?.toString()
            var num3 = input3!!.text?.toString()
            var nu1= num1?.let { it1 -> seguridad(it1) }
            var nu2= num2?.let { it1 -> seguridad(it1) }
            var nu3= num3?.let { it1 -> seguridad(it1) }
//
//            if (num2==null || num2.equals("")){
//                 nu2=0.0
//            }else{
//                 nu2= num2.toDoubleOrNull()!!
//                if(nu2==null)nu2=0.0
//            }
//            if (num3==null || num3.equals("")){
//                 nu3=0.0
//            }else{
//                 nu3=num3.toDoubleOrNull()!!
//                if(nu3==null) nu3=0.0
//            }

            if (nu1 != null) {
                if (nu2 != null) {
                    if (nu3 != null) {
                        lanzarNewPlayer(nu1,nu2,nu3)
                    }
                }
            }
        }

    }
    fun seguridad(string:String):Double{
        var resultao=0.0
        if (string==null || string.equals("")){
            resultao=0.0
        }else{
            try {
                resultao = parseDouble(string)
            } catch (e: NumberFormatException) {
                resultao = 0.0
            }

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
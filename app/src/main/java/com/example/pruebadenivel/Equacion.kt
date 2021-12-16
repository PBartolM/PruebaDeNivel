package com.example.pruebadenivel

class Equacion(num1:Double,num2:Double,num3:Double) {
    var a:Double
    var b:Double
    var c:Double
    var sol1:Double=0.0
    var sol2:Double=0.0
    init {
        this.a=num1
        this.b=num2
        this.c=num3
    }
    fun resuelve():String{
        val determinante = b * b - 4.0 * a * c
        var solucion=""
        if(a==0.0 && b==0.0 && c==0.0){
            return "No hay equacion"
        }
        if (determinante>0.0){
            sol1 = (-b + Math.sqrt(determinante)) / (2 * a)
            sol2 = (-b - Math.sqrt(determinante)) / (2 * a)
            solucion="La soluciones son $sol1 y $sol2"
        }else if (determinante==0.0){
           sol1 = -b / (2 * a)
            solucion="Hay una unica solucion $sol1"
        }else{

            val real = -b / (2 * a)
            val imaginario = Math.sqrt(-determinante) / (2 * a)
           solucion="El resultado es complejo : $real + i$imaginario y $real - i$imaginario"
            
        }
        return solucion
    }
}
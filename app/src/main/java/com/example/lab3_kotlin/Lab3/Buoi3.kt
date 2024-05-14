package com.example.lab3_kotlin.Lab3

fun main(){
    val soA = 5
    val soB = 10
    val luyThuaBac3CuaA = soA.let {
        val kq = it * it * it
        kq
    }

    val title : String? = "Buoi 3 android Kotlin"
    val length = title?.run {
        if (isEmpty()) {
            0
        }else{
            length
        }
    }
    println(luyThuaBac3CuaA)
    println("Tổng 2 sô $soA + $soB = ${tingTong(soA,soB)}")
    println("Tích 2 sô $soA * $soB = ${phepNhan(soA,soB)}")
    println("Chia 2 sô $soA / $soB = ${phepChia(soA.toFloat(),soB.toFloat())}")
    println("Lũy thừa 2 sô $soA ^ $soB = ${luyThua(soA)}")
}
val tingTong = {soA:Int,soB:Int -> (soA + soB)}

val phepNhan : (Int,Int) -> Int = {soA:Int,soB:Int -> (soA * soB)}

val phepChia = {soA:Float , soB:Float -> {
    if(soB == 0f){
        "Số bi phải khác 0!"
    }else{
        val kq = soA / soB
        kq
    }
}}
val luyThua : (Int) -> Int = {it * it}
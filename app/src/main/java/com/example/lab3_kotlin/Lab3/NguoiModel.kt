package com.example.lab3_kotlin.Lab3

open class NguoiModel(var hoten: String, var tuoi: Int?, var quequan: String?) {

    open fun getThongTin () : String {
        return "$hoten - Tuoi: $tuoi - Que: $quequan"
    }

}
package com.example.lab3_kotlin.Lab3

open class SinhVien(var hoTen: String,var tuoi: Int, var lop: String) {

    fun getThongTin() : String{
        if(hoTen != null && tuoi != null && lop != null){
            return "Họ tên: $hoTen, Tuổi: $tuoi, Lớp: $lop"
        }else{
            return ""
        }
    }

    override fun toString(): String {
        return "SinhVien(hoTen='$hoTen', tuoi=$tuoi, lop='$lop')"
    }


}
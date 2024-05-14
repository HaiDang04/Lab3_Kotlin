package com.example.lab3_kotlin.Lab3

class CBGV (hoten: String, tuoi: Int?, quequan: String?,var msgv: String, var luongcung: Float, var lthuong: Float?, var lphat: Float?)
    : NguoiModel(hoten, tuoi, quequan) {

        var lThucLinh : Float = 0f
            get() = luongcung + (lthuong?:0f) - (lphat?:0f)

    override fun getThongTin(): String {
        return "CGBV: ${super.getThongTin()} - MSGV: $msgv - Luong Thuc Linh: $lThucLinh"
    }
}
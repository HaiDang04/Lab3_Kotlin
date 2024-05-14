package com.example.lab3_kotlin.Lab3

import java.util.Date

class TheMuon(
    hoTen: String,
    tuoi: Int,
    lop: String,
    maPhieuMuon: String,
    ngayMuon: String,
    hanTra: String,
    soHieuSach: String,
) : SinhVien(hoTen, tuoi, lop){

    var maPhieuMuon : String = maPhieuMuon
    var ngayMuon : String = ngayMuon
    var hanTra : String = hanTra
    var soHieuSach : String = soHieuSach

    fun getThongTinTheMuon() : String {
        return  """hoTen : $hoTen - tuoi : $tuoi - lop : $lop - maPhieuMuon : $maPhieuMuon - ngayMuon : $ngayMuon - hanTra : $hanTra - soHieuSach : $soHieuSach"""
    }
    override fun toString(): String {
        return "TheMuon(maPhieuMuon='$maPhieuMuon', ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach='$soHieuSach')"
    }


}
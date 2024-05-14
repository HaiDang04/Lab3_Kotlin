package com.example.lab3_kotlin.Lab3

fun main(){
    var gv1 = CBGV("Bui Hai Dang", 30, "HN", "ph12345", 500f, 50f, 10f)
    println(gv1.getThongTin())

    val danhSachGiaoVien = mutableListOf<CBGV>()
    danhSachGiaoVien.add(gv1)
    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    themGiaoVien(danhSachGiaoVien)
                }

                2 -> {
                    hienThiDanhSachGiaoVien(danhSachGiaoVien)
                }

                3 -> {
                    xoaGiaoVien(danhSachGiaoVien)
                }

                4 -> {
                    capNhatThongTinGiaoVien(danhSachGiaoVien)
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)
}

fun themGiaoVien(danhSachGiaoVien: MutableList<CBGV>) {
    println("Them giao vien")
    println("--------------------------")

    print("Nhap ho ten: ")
    val hoTen = readLine()

    print("Nhap tuoi: ")
    val tuoi = readLine()?.toIntOrNull()

    print("Nhap que quan: ")
    val queQuan = readLine()

    print("Nhap MSGV: ")
    val msgv = readLine()

    print("Nhap luong cung: ")
    val luongCung = readLine()?.toFloatOrNull()

    print("Nhap luong thuong (nhap 'null' neu khong co): ")
    val luongThuong = readLine()?.toFloatOrNull()

    print("Nhap luong phat (nhap 'null' neu khong co): ")
    val luongPhat = readLine()?.toFloatOrNull()

    val giaoVien = CBGV(hoTen.orEmpty(), tuoi, queQuan.orEmpty(), msgv.orEmpty(), luongCung ?: 0f, luongThuong, luongPhat)
    danhSachGiaoVien.add(giaoVien)

    println("Giao vien da duoc them vao danh sach.")
}

fun hienThiDanhSachGiaoVien(danhSachGiaoVien: List<CBGV>) {
    println("Danh sach giao vien")
    println("--------------------------")

    if (danhSachGiaoVien.isEmpty()) {
        println("Khong co giao vien trong danh sach.")
    } else {
        for ((index, giaoVien) in danhSachGiaoVien.withIndex()) {
            println("Giao vien ${index + 1}:")
            println(giaoVien.getThongTin())
            println("--------------------------")
        }
    }
}

fun xoaGiaoVien(danhSachGiaoVien: MutableList<CBGV>) {
    println("Xoa giao vien")
    println("--------------------------")
    print("Nhap MSGV can xoa: ")
    val msgv = readLine()

    val giaoVien = danhSachGiaoVien.find { it.msgv == msgv }

    if (giaoVien != null) {
        danhSachGiaoVien.remove(giaoVien)
        println("Giao vien co MSGV '$msgv' da duoc xoa.")
    } else {
        println("Khong tim thay giao vien co MSGV '$msgv'.")
    }
}

fun capNhatThongTinGiaoVien(danhSachGiaoVien: MutableList<CBGV>) {
    println("Cap nhat thong tin giao vien")
    println("--------------------------")
    print("Nhap MSGV can cap nhat: ")
    val msgv = readLine()

    val giaoVien = danhSachGiaoVien.find { it.msgv == msgv }

    if (giaoVien != null) {
        println("Thong tin hien tai cua giao vien:")
        println(giaoVien.getThongTin())
        println("--------------------------")

        print("Nhap ho ten moi (nhap 'null' de bo qua): ")
        val hoTen = readLine()
        if (hoTen != null) {
            giaoVien.hoten = hoTen
        }

        print("Nhap tuoi moi (nhap 'null' de bo qua): ")
        val tuoi = readLine()?.toIntOrNull()
        if (tuoi != null) {
            giaoVien.tuoi = tuoi
        }

        print("Nhap que quan moi (nhap 'null' de bo qua): ")
        val queQuan = readLine()
        if (queQuan != null) {
            giaoVien.quequan = queQuan
        }

        print("Nhap luong cung moi (nhap 'null' de bo qua): ")
        val luongCung = readLine()?.toFloatOrNull()
        if (luongCung != null) {
            giaoVien.luongcung = luongCung
        }

        print("Nhap luong thuong moi (nhap 'null' de bo qua): ")
        val luongThuong = readLine()?.toFloatOrNull()
        if (luongThuong != null) {
            giaoVien.lthuong = luongThuong
        }

        print("Nhap luong phat moi (nhap 'null' de bo qua): ")
        val luongPhat = readLine()?.toFloatOrNull()
        if (luongPhat != null) {
            giaoVien.lphat = luongPhat
        }

        println("Cap nhat thong tin thanh cong.")
    } else {
        println("Khong tim thay giao vien co MSGV '$msgv'.")
    }
}
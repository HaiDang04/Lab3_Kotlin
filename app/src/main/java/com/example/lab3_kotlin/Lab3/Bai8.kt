package com.example.lab3_kotlin.Lab3

/**
 * Thư viện trung tâm đại học quốc gia có nhu cầu quản lý việc mượn, trả sách. Sinh viên đăng ký tham gia mượn sách thông qua thẻ mà thư viện cung cấp.
 *
 * Với mỗi thẻ sẽ lưu các thông tin sau: Mã phiếu mượn, ngày mượn, hạn trả, số hiệu sách, và các thông tin cá nhân của sinh viên mượn sách. Các thông tin của sinh viên mượn sách bao gồm: Họ tên, tuổi, lớp.
 *
 * Để đơn giản cho ứng dụng console. Chúng ta mặc định ngày mượn, ngày trả là số nguyên dương.
 *
 * Yêu cầu 1: Xây dựng lớp SinhVien để quản lý thông tin của mỗi sinh viên.
 *
 * Yêu cầu 2: Xây dựng lớp TheMuon để quản lý việc mượn trả sách của các sinh viên.
 *
 * Yêu cầu 3: Xây dựng các phương thức: Thêm, xoá theo mã phiếu mượn và hiển thị thông tin các thẻ mượn.
 **/

fun deleteTheMuon(listTheMuon : MutableList<TheMuon>){
    var maPhieuMuon : String?
    println("Xóa thông tin Thẻ Mượn")
    println("------------------------")
    println("Nhập Mã Thẻ Mượn Cần Xóa")
    maPhieuMuon = readLine().toString()
    for (i in listTheMuon.indices) {
        if (listTheMuon[i].maPhieuMuon == maPhieuMuon) {
            listTheMuon.removeAt(i)
            println("Xóa thẻ mượn với mã thẻ mượn $maPhieuMuon thành công")
            getTheMuon(listTheMuon)
            return
        }
    }
    println("Cán bộ giáo viên với mã số giáo viên $maPhieuMuon không tồn tại")
}
fun addTheMuon(listTheMuon : MutableList<TheMuon>){
    var hoTen: String?
    var tuoi: Int?
    var lop: String?
    var maPhieuMuon: String?
    var ngayMuon: String?
    var hanTra: String?
    var soHieuSach: String?
    println("Thêm Thông Tin Thẻ Mượn")
    println("------------------------")
    println("Nhập họ tên sinh viên")
    hoTen = readLine().toString()
    println("Nhập tuổi sinh viên")
    tuoi = readLine()!!.toIntOrNull()
    println("Nhập lớp sinh viên")
    lop = readLine().toString()
    println("Nhập mã phiếu mượn")
    maPhieuMuon = readLine().toString()
    println("Nhập ngày mượn")
    ngayMuon = readLine().toString()
    println("Nhập hạn trả")
    hanTra = readLine().toString()
    println("Nhập số hiệu sách")
    soHieuSach = readLine().toString()
    val dateRegex = Regex("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}")
    if(!ngayMuon.matches(dateRegex)){
        println("Sai ngày mượn")
        return
    }
    if(!hanTra.matches(dateRegex)){
        println("Sai hạn trả")
        return
    }
    if (tuoi == null ) {
        println("Tuổi không hợp lệ")
        return
    }else if (tuoi < 18 || tuoi > 25) {
        println("Tuổi phải từ 18 đến 25")
        return
    }
    val theMuon = TheMuon(hoTen, tuoi!!, lop, maPhieuMuon, ngayMuon, hanTra, soHieuSach)
    listTheMuon.add(theMuon)
    println("Thêm thẻ mượn thành công")
}
fun getTheMuon(listTheMuon : MutableList<TheMuon>){
    if (listTheMuon.isEmpty()) {
        println("Danh sách thẻ mượn đang trống")
        return
    }
    for (i in listTheMuon.indices){
        println("Thông Tin $i : ${listTheMuon.get(i).getThongTinTheMuon()} ")
    }
}
fun main () {
    val listTheMuon = mutableListOf<TheMuon>()
    listTheMuon.add(TheMuon("Nguyễn Văn A",15,"H3456","JSASASJ","10-12-2004","10-12-2023","2023"))
    listTheMuon.add(TheMuon("Nguyễn Văn A",15,"H3456","Hjaja","10-12-2004","10-12-2023","2023"))
    while (true) {
        println("Mời nhập lựa chọn của bạn")
        println("0. Thoát chương trình")
        println("1. Hiển thị thông tin các thẻ đã mượn")
        println("2. Thêm thẻ mượn")
        println("3. Xóa thẻ mượn")
        val choice = readlnOrNull()?.toIntOrNull()

        when (choice) {
            1 -> {
                println("Bạn chọn hiển thị thông tin các thẻ đã mượn")
                getTheMuon(listTheMuon)
            }
            2 -> {
                println("Bạn chọn thêm thẻ mượn")
                addTheMuon(listTheMuon)
            }
            3 -> {
                println("Bạn chọn xóa thẻ mượn")
                deleteTheMuon(listTheMuon)
            }
            0 -> {
                println("Thoát chương trình")
                return
            }
            else -> println("Lựa chọn $choice không hợp lệ")
        }
    }
}
class Bai8 {
}
package vn.udn.ute.quanlychitieu.helper

fun Long.dinhDangTien(): String {
    val chuoi = this.toString().reversed().chunked(3).joinToString(".").reversed()
    return "$chuoi đ"
}
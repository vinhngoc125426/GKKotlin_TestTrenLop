package vn.udn.ute.quanlychitieu.model

data class ChiTieu(
    val tenKhoan: String,
    val soTien: Long,
    val loai: String
) {
    fun moTa(): String {
        return "Khoản chi: $tenKhoan - Số tiền: $soTien - Loại: $loai"
    }
}
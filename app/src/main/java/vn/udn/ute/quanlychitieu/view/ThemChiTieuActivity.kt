package vn.udn.ute.quanlychitieu.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vn.udn.ute.quanlychitieu.R

class ThemChiTieuActivity : AppCompatActivity() {

    private lateinit var edtTenKhoan: EditText
    private lateinit var edtSoTien: EditText
    private lateinit var edtGhiChu: EditText
    private lateinit var btnLuu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_them_chi_tieu)

        edtTenKhoan = findViewById(R.id.edtTenKhoan)
        edtSoTien = findViewById(R.id.edtSoTien)
        edtGhiChu = findViewById(R.id.edtGhiChu)
        btnLuu = findViewById(R.id.btnLuu)

        btnLuu.setOnClickListener {
            xuLyLuu()
        }
    }

    private fun xuLyLuu() {
        val tenKhoan = edtTenKhoan.text.toString().trim()
        val soTienStr = edtSoTien.text.toString().trim()
        val ghiChu = edtGhiChu.text.toString().trim()

        if (!kiemTraDuLieu(tenKhoan, soTienStr, ghiChu)) {
            return
        }

        // Dữ liệu hợp lệ
        Toast.makeText(this, "Lưu thành công", Toast.LENGTH_SHORT).show()
    }

    private fun kiemTraDuLieu(tenKhoan: String, soTienStr: String, ghiChu: String): Boolean {
        if (tenKhoan.isEmpty()) {
            Toast.makeText(this, "Tên khoản chi không được để trống", Toast.LENGTH_SHORT).show()
            return false
        }

        val soTien = soTienStr.toLongOrNull()
        if (soTien == null || soTien < 1000 || soTien > 50000000) {
            Toast.makeText(this, "Số tiền phải từ 1000 đến 50000000", Toast.LENGTH_SHORT).show()
            return false
        }

        if (ghiChu.length > 100) {
            Toast.makeText(this, "Ghi chú tối đa 100 ký tự", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }
}
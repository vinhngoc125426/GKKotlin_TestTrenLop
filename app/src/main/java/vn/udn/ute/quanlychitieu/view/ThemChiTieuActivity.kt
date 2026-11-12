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

        Toast.makeText(this, "Đã nhấn Lưu: $tenKhoan", Toast.LENGTH_SHORT).show()
    }
}
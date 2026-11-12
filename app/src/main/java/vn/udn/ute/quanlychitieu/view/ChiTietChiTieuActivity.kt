package vn.udn.ute.quanlychitieu.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.IntentCompat
import vn.udn.ute.quanlychitieu.R
import vn.udn.ute.quanlychitieu.helper.dinhDangTien
import vn.udn.ute.quanlychitieu.model.ChiTieu

class ChiTietChiTieuActivity : AppCompatActivity() {

    companion object {
        const val KEY_CHI_TIEU = "chi_tieu"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chi_tiet_chi_tieu)

        val chiTieu = IntentCompat.getParcelableExtra(intent, KEY_CHI_TIEU, ChiTieu::class.java)

        if (chiTieu != null) {
            findViewById<TextView>(R.id.tvChiTietTen).text = "Tên khoản: ${chiTieu.tenKhoan}"
            findViewById<TextView>(R.id.tvChiTietSoTien).text = "Số tiền: ${chiTieu.soTien.dinhDangTien()}"
            findViewById<TextView>(R.id.tvChiTietLoai).text = "Loại: ${chiTieu.loai}"
        }
    }
}
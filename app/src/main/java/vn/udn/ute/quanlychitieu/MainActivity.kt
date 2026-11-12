package vn.udn.ute.quanlychitieu.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vn.udn.ute.quanlychitieu.R
import vn.udn.ute.quanlychitieu.adapter.ChiTieuAdapter
import vn.udn.ute.quanlychitieu.model.ChiTieu
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var rvChiTieu: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvChiTieu = findViewById(R.id.rvChiTieu)

        val ds = listOf(
            ChiTieu("Ăn sáng", 30000, "Ăn uống"),
            ChiTieu("Tiền xăng", 80000, "Di chuyển"),
            ChiTieu("Tiền trọ", 1500000, "Nhà ở"),
            ChiTieu("Mua sách", 250000, "Học tập"),
            ChiTieu("Xem phim", 120000, "Giải trí")
        )

        rvChiTieu.layoutManager = LinearLayoutManager(this)
        rvChiTieu.adapter = ChiTieuAdapter(ds) { chiTieu ->
            val intent = Intent(this, ChiTietChiTieuActivity::class.java)
            intent.putExtra(ChiTietChiTieuActivity.KEY_CHI_TIEU, chiTieu)
            startActivity(intent)
        }
    }
}
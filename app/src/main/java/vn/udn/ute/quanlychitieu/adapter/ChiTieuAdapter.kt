package vn.udn.ute.quanlychitieu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vn.udn.ute.quanlychitieu.R
import vn.udn.ute.quanlychitieu.helper.dinhDangTien
import vn.udn.ute.quanlychitieu.model.ChiTieu

class ChiTieuAdapter(
    private val ds: List<ChiTieu>
) : RecyclerView.Adapter<ChiTieuAdapter.ChiTieuViewHolder>() {

    class ChiTieuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTenKhoan: TextView = itemView.findViewById(R.id.tvTenKhoan)
        val tvSoTien: TextView = itemView.findViewById(R.id.tvSoTien)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChiTieuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chi_tieu, parent, false)
        return ChiTieuViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChiTieuViewHolder, position: Int) {
        val item = ds[position]
        holder.tvTenKhoan.text = item.tenKhoan
        holder.tvSoTien.text = item.soTien.dinhDangTien()
    }

    override fun getItemCount(): Int = ds.size
}
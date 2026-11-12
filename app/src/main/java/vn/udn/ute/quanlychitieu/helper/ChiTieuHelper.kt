package vn.udn.ute.quanlychitieu.helper

import vn.udn.ute.quanlychitieu.model.ChiTieu

object ChiTieuHelper {

    fun tongTien(ds: List<ChiTieu>): Long {
        var tong = 0L
        for (item in ds) {
            tong += item.soTien
        }
        return tong
    }

    fun locTheoLoai(ds: List<ChiTieu>, loai: String): List<ChiTieu> {
        return ds.filter { it.loai == loai }
    }
}
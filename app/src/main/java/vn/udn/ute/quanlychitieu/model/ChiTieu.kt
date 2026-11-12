package vn.udn.ute.quanlychitieu.model

import android.os.Parcel
import android.os.Parcelable

data class ChiTieu(
    val tenKhoan: String,
    val soTien: Long,
    val loai: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readLong(),
        parcel.readString() ?: ""
    )

    fun moTa(): String {
        return "Khoản chi: $tenKhoan - Số tiền: $soTien - Loại: $loai"
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(tenKhoan)
        parcel.writeLong(soTien)
        parcel.writeString(loai)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<ChiTieu> {
        override fun createFromParcel(parcel: Parcel): ChiTieu = ChiTieu(parcel)
        override fun newArray(size: Int): Array<ChiTieu?> = arrayOfNulls(size)
    }
}
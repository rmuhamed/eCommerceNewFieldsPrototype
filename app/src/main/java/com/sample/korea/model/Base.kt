package com.sample.korea.model

import android.os.Parcel
import android.os.Parcelable

open class Base(private val id: String) : Parcelable {

    constructor(parcel: Parcel) : this(parcel.readString()!!)

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Base> {
        override fun createFromParcel(parcel: Parcel): Base {
            return Base(parcel)
        }

        override fun newArray(size: Int): Array<Base?> {
            return arrayOfNulls(size)
        }
    }
}
package com.sample.korea.model

import android.os.Parcel
import android.os.Parcelable

class Child : Base, Parcelable {
    val label: String

    constructor(parcel: Parcel) : super(parcel) {
        label = parcel.readString() ?: "It's not WORKING YET"
    }

    constructor(_childId: String, _label: String) : super(_childId) {
        label = _label
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        super.writeToParcel(parcel, flags)
        parcel.writeString(label)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Child> {
        override fun createFromParcel(parcel: Parcel): Child {
            return Child(parcel)
        }

        override fun newArray(size: Int): Array<Child?> {
            return arrayOfNulls(size)
        }
    }
}
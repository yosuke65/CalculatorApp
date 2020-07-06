package com.example.lecture2.models

import android.os.Parcel
import android.os.Parcelable
import android.util.Log

data class Customer(
    var name: String?,
    var email:String?,
    var mobile: String?
): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
        Log.i("demo4", "Parcel Constructor called)")
    }

    override fun writeToParcel(parcel: Parcel?, flag: Int) {
        Log.i("demo4", "writeToParcel")
        parcel?.writeString(name)
        parcel?.writeString(email)
        parcel?.writeString(mobile)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Customer> {
        const val KEY = "customer"
        override fun createFromParcel(parcel: Parcel): Customer {
            Log.i("demo4", "createFromParcel")

            return Customer(parcel)
        }

        override fun newArray(size: Int): Array<Customer?> {
            Log.i("demo4", "newArray")
            return arrayOfNulls(size)
        }
    }
}


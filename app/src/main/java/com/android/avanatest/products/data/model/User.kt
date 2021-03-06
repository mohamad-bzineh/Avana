package com.android.avanatest.products.data.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class User(var name: String? = null, var email: String? = null) : Parcelable

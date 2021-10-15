package com.example.recyclerview_rifdahinasnazhifah_29

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DAY6 (
    val member: Int,
    val judul: String,
    val date: String
) : Parcelable
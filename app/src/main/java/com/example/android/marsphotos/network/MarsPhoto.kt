package com.example.android.marsphotos.network

import com.squareup.moshi.Json
data class MarsPhoto(
    val albumId: Float,
    val id: Float,
    val title: String,
    val url: String,
    val thumbnailUrl : String
)
/*data class atau objek data yang digunakan pada projek ini*/
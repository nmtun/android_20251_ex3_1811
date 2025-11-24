package com.example.it4785_android_1811_ex3.data

data class AppItem(
    val id: String,
    val name: String,
    val categories: String,
    val rating: Float,
    val size: String,
    val iconColor: Long = 0xFF6200EE,
    val drawableResourceName: String? = null // Tên resource drawable (ví dụ: "netflix", "spotify")
)

data class AppSection(
    val id: String,
    val title: String,
    val isHorizontal: Boolean = false,
    val apps: List<AppItem>
)


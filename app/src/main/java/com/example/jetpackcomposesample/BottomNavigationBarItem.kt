package com.example.jetpackcomposesample

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationBarItem(
    var name: String,
    var route: String,
    var icon: ImageVector,
    var badgeCount: Int = 0
)

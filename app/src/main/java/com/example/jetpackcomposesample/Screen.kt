package com.example.jetpackcomposesample

sealed class Screen(var route: String) {
    object MainScreen : Screen("main_screen")
    object DetailsScreen : Screen("details_screen")

    fun withArgs(vararg arg: String): String {
        return buildString {
            append(route)
            arg.forEach {
                append("/$it")
            }
        }

    }
}

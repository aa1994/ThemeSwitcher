package com.example.adityaagarwal.themeswitcher

import android.content.Intent

class ThemeSwitcherUtil {

    companion object {
        private var themeInteger : Int = 0
    }

    fun updateTheme(activity: MainActivity, theme: Int = 0) {
        themeInteger = theme
        activity.finish()
        activity.startActivity(Intent(activity, MainActivity::class.java))
        activity.overridePendingTransition(android.R.anim.fade_out, android.R.anim.fade_in)
    }

    fun setDefaultTheme(activity: MainActivity) {
        when (themeInteger) {
            2 -> activity.setTheme(R.style.second_theme)
            3 -> activity.setTheme(R.style.third_theme)
            else -> activity.setTheme(R.style.first_theme)
        }
    }
}
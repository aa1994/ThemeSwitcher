package com.example.adityaagarwal.themeswitcher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var themeSwitcherUtil = ThemeSwitcherUtil()
    private var themeApp = ThemeApp()

    init {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        themeSwitcherUtil.setDefaultTheme(this)
        setContentView(R.layout.activity_main)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        first_theme.setOnClickListener {
            themeApp.themeInteger = 1
            themeSwitcherUtil.updateTheme(this, 1)
        }
        second_theme.setOnClickListener {
            themeApp.themeInteger = 2
            themeSwitcherUtil.updateTheme(this, 2)
        }
        third_theme.setOnClickListener {
            themeApp.themeInteger = 3
            themeSwitcherUtil.updateTheme(this, 3)
        }
    }


}

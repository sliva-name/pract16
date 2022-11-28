package com.example.practice16_

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Resources.Theme
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val sharedP = this.getSharedPreferences("MAGA", MODE_PRIVATE)

        val theme = sharedP.getInt("my_theme", R.style.NightTheme)

        setTheme(theme)

        setContentView(R.layout.activity_main)

    }
    fun switchClick(view: View) {

        val shared = getSharedPreferences("MAGA", MODE_PRIVATE)

        val sw = view as Switch

        if (sw.isChecked){

            shared.edit().clear().apply()

            shared.edit().putInt("my_theme", R.style.LightTheme).apply()

            recreate()

        }
        else{

            shared.edit().clear().apply()

            shared.edit().putInt("my_theme", R.style.NightTheme).apply()

            recreate()

        }
    }
    fun changeButton_Click(view: View) {
        val shared = getSharedPreferences("MAGA", MODE_PRIVATE)
        val theme = shared.getInt("my_theme", R.style.NightTheme)
        if (theme==R.style.NightTheme)
        {

            shared.edit().clear().apply()

            shared.edit().putInt("my_theme", R.style.LightTheme).apply()

            recreate()

        }
        else
        {

            shared.edit().clear().apply()

            shared.edit().putInt("my_theme", R.style.NightTheme).apply()

            recreate()

        }
    }
}
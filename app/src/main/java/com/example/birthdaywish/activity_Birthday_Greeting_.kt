package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity__birthday__greeting_.*
import kotlinx.android.synthetic.main.activity_main.*

class activity_Birthday_Greeting_ : AppCompatActivity() {

    companion object{
       const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__birthday__greeting_)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday\n  $name"

    }
}
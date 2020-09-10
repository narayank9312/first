package com.example.birthdaywish

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }


    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
//        Toast.makeText(this, "name is $name",Toast.LENGTH_LONG).show()
        val intent = Intent(this, activity_Birthday_Greeting_::class.java)
        intent.putExtra(activity_Birthday_Greeting_.NAME_EXTRA, name)

        startActivity(intent)

    }
}



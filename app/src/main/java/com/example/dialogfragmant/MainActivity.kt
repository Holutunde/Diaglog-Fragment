package com.example.dialogfragmant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rateTextView: TextView = findViewById(R.id.rateTextView)
        rateTextView.setOnClickListener{
            var dialog = DialogFragment()

            dialog.show(supportFragmentManager, "customDialog")
        }

    }
}
package com.example.myexchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val num = editText.text.toString().toDoubleOrNull()
            if (num == null) {
                Toast.makeText(this, "Ввод только чисел", Toast.LENGTH_SHORT).show()
            } else {
                val converted = num / 74
                textView.text = converted.toString()
            }
        }
    }
}

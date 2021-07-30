package com.hyeonseungson.part2chapter1test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button 1
        chkBtn1.setOnClickListener {
            Toast.makeText(this, "btn1 Click", Toast.LENGTH_SHORT).show()
            val chk1 = editText1.text.toString()
            textView.setText("입력한 값 : $chk1")
        }

        // Button 2
        val btn2 = findViewById<Button>(R.id.chkBtn2)
        btn2.setOnClickListener {
            Toast.makeText(this, "btn2 click", Toast.LENGTH_SHORT).show()
            // editText2
            val chk2 = findViewById<EditText>(R.id.editText2).text
            val txtVw = findViewById<TextView>(R.id.textView)
            txtVw.setText("입력한 값 : $chk2")
            Log.d("chk1", chk2.toString())
        }
    }
}
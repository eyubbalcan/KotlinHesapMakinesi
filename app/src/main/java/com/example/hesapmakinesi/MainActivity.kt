package com.example.hesapmakinesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number1: EditText = findViewById(R.id.number1)
        val number2: EditText = findViewById(R.id.number2)
        val sonuc: TextView = findViewById(R.id.sonuc)


        val btnTopla: Button = findViewById(R.id.btnTopla)
        val btnCikar: Button = findViewById(R.id.btnCikar)
        val btnCarp: Button = findViewById(R.id.btnCarp)
        val btnBol: Button = findViewById(R.id.btnBol)
        val btnGec: Button = findViewById(R.id.intent)


        btnTopla.setOnClickListener {
            val sayi1: Int = Integer.parseInt(number1.text.toString())
            val sayi2: Int = Integer.parseInt(number2.text.toString())
            val iSonuc = sayi1 + sayi2
            sonuc.text = iSonuc.toString()

            if (iSonuc == 80) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }

        btnCikar.setOnClickListener {
            val sayi1: Int = Integer.parseInt(number1.text.toString())
            val sayi2: Int = Integer.parseInt(number2.text.toString())
            val iSonuc = sayi1 - sayi2
            sonuc.text = iSonuc.toString()

            if (iSonuc == 80) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }

        btnBol.setOnClickListener {
            val sayi1: Int = Integer.parseInt(number1.text.toString())
            val sayi2: Int = Integer.parseInt(number2.text.toString())
            val iSonuc = sayi1 / sayi2
            sonuc.text = iSonuc.toString()

            if (iSonuc == 80) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }

        btnCarp.setOnClickListener {
            val sayi1: Int = Integer.parseInt(number1.text.toString())
            val sayi2: Int = Integer.parseInt(number2.text.toString())
            val iSonuc = sayi1 * sayi2
            sonuc.text = iSonuc.toString()
            if (iSonuc == 80) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }

        btnGec.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}


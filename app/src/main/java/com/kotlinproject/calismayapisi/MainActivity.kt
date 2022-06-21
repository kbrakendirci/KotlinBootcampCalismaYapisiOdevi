package com.kotlinproject.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.kotlinproject.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        button()

    }

    fun button(){
        tasarim.btnGoA.setOnClickListener {
            val intent = Intent(this@MainActivity,ActivityPageA::class.java)
            startActivity(intent)
        }

        tasarim.btnGoX.setOnClickListener {
            val intent = Intent(this@MainActivity,ActivityPageX::class.java)
            startActivity(intent)
        }

    }
}
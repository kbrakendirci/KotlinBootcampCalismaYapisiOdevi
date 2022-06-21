package com.kotlinproject.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlinproject.calismayapisi.databinding.ActivityPageBinding
import com.kotlinproject.calismayapisi.databinding.ActivityPageXBinding
import kotlinx.android.synthetic.main.activity_page.*

class ActivityPageX : AppCompatActivity() {
    private lateinit var tasarim : ActivityPageXBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityPageXBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        button()
    }

    fun button(){
        tasarim.btnGoY.setOnClickListener {
            val intent = Intent(this@ActivityPageX,ActivityPageY::class.java)
            startActivity(intent)
            finish()
        }
    }
}
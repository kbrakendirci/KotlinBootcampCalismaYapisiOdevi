package com.kotlinproject.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlinproject.calismayapisi.databinding.ActivityMainBinding
import com.kotlinproject.calismayapisi.databinding.ActivityPageBinding
import kotlinx.android.synthetic.main.activity_page.*

class ActivityPageA : AppCompatActivity() {
    private lateinit var tasarim : ActivityPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        button()
    }
    fun button(){
        btnGoB.setOnClickListener {
            val intent = Intent(this@ActivityPageA,ActivityPageB::class.java)
            startActivity(intent)
            finish()
        }
    }
}
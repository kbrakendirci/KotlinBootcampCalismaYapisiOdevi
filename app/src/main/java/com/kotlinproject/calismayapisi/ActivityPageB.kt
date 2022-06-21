package com.kotlinproject.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlinproject.calismayapisi.databinding.ActivityPageBBinding
import com.kotlinproject.calismayapisi.databinding.ActivityPageBinding
import kotlinx.android.synthetic.main.activity_page.*

class ActivityPageB : AppCompatActivity() {
    private lateinit var tasarim : ActivityPageBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityPageBBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        button()
    }
    fun button(){
        tasarim.btnGoY.setOnClickListener {
            val intent = Intent(this@ActivityPageB,ActivityPageY::class.java)
            startActivity(intent)
            finish()
        }
    }
}
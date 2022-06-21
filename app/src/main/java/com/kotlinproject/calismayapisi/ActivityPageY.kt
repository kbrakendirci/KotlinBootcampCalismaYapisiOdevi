package com.kotlinproject.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.kotlinproject.calismayapisi.databinding.ActivityPageBBinding
import com.kotlinproject.calismayapisi.databinding.ActivityPageYBinding

class ActivityPageY : AppCompatActivity() {
    private lateinit var tasarim : ActivityPageYBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityPageYBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        button()
    }

    override fun onBackPressed() {
        Snackbar.make(tasarim.textView5,"Geri dönmek istiyor musunuz?",Snackbar.LENGTH_LONG)
            .setAction("evet"){
                super.onBackPressed()
            }.show()

    }
    fun button(){
        tasarim.btnGoAnasayfa.setOnClickListener {
            val intent = Intent(this@ActivityPageY,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.agaba.intellectsoftnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val a = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(a)
            finish()
        },4000)
    }
}
package com.example.androidlab

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 스플래시 화면
        installSplashScreen()
        super.onCreate(savedInstanceState)

        // 2초 슬립
        Thread.sleep(2000)

        // MainActivity 이동
        startActivity(Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        })

        //종료
        finish()
    }
}

package com.example.androidlab2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)  // 스플래시 화면에 사용할 레이아웃 설정

        // 5초 후 MainActivity로 넘어가기
        Handler(Looper.getMainLooper()).postDelayed({
            // MainActivity로 화면 전환
            startActivity(Intent(this, MainActivity::class.java))
            finish()  // SplashActivity 종료
        }, 5000)  // 5초 후
    }
}

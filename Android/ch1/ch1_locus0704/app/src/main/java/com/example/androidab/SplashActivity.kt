package com.example.androidab

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Splash Theme 적용 (액티비티의 기본 레이아웃을 사용하지 않음)
//        setTheme(R.style.Theme_Splash)

        // 일정 시간(예: 2초) 후 MainActivity로 이동
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish() // 스플래시 액티비티 종료
        }, 2000) // 2000ms = 2초
    }
}

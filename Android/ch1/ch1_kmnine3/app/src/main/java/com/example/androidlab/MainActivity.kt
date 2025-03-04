package com.example.androidlab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    // 데이터 로딩 상태
    private var isDataReady = false

    override fun onCreate(savedInstanceState: Bundle?) {
        // SplashScreen API 설치 (반드시 super.onCreate() 전에 호출)
        val splashScreen = installSplashScreen()

        // 스플래시 화면이 표시되는 조건 설정
        splashScreen.setKeepOnScreenCondition {
            !isDataReady
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            delay(2000) // 2초 대기
            isDataReady = true
        }
    }
}
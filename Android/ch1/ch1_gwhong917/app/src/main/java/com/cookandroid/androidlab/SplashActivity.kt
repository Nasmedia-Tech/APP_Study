package com.cookandroid.androidlab

//import android.window.SplashScreen
//import androidx.core.splashscreen.SplashScreen

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.ComponentActivity
import androidx.compose.animation.core.animate
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 로딩화면 설치? //여기까지만 하면 앱 아이콘이 로딩화면처럼 나타남...
        val splashScreen = installSplashScreen()

        // 로딩 끝나면 MainActivity로 넘어가기
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

        // SplashActivity 종료
        finish()
    }
}

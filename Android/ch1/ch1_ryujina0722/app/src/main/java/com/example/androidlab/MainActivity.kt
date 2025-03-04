package com.example.androidlab

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 🟡 API 버전에 따라 `enableEdgeToEdge()` 적용 여부 결정
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) { // Android 12 이상
            enableEdgeToEdge()
        }

        setContentView(R.layout.activity_main)

        // 🟡 `findViewById()`가 `null`이면 실행되지 않도록 변경
        val rootView = findViewById<View>(R.id.main)
        rootView?.let {
            ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}



/*
package com.example.androidlab

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    // 🟡 스플래시 화면 유지 시간 (밀리초 단위)
    private val splashTime: Long = 10000  // 5초 유지

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 🟡 API 버전에 따라 `enableEdgeToEdge()` 적용 여부 결정
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) { // Android 12 이상
            enableEdgeToEdge()
        }

        // 🟡 스플래시 화면 적용
        showSplashScreen()
    }

    private fun showSplashScreen() {
        setContentView(R.layout.activity_splash)  // 스플래시 레이아웃 적용

        // 🟡 Coroutine을 사용하여 일정 시간 후 메인 레이아웃으로 변경
        CoroutineScope(Dispatchers.Main).launch {
            delay(splashTime)
            setContentView(R.layout.activity_main)  // 일정 시간 후 메인 화면 적용

            // 🟡 `findViewById()`가 `null`이면 실행되지 않도록 변경
            val rootView = findViewById<View>(R.id.main)
            rootView?.let {
                ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                    insets
                }
            }
        }
    }
}
*/

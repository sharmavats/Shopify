package com.android.shopify

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager.LayoutParams.*

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //to get full screen without topbar
        @Suppress("deprecation")
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }
        else{
            window.setFlags(
                FLAG_FULLSCREEN,
                FLAG_FULLSCREEN
            )
        }

        //to move to next activity after a particular time
        @Suppress("deprecation")
        Handler().postDelayed(
            {
            startActivity(Intent(this@splashScreen,MainActivity::class.java))
        },
        2500)

    }
}
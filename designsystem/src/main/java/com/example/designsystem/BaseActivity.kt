package com.example.designsystem

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    open fun testedeLog() {
        Log.e("LOG", "TESTE_BASE")
    }
}
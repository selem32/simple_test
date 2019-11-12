package com.example.designsystem

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    open fun testeDeLog() {
        Log.e("LOG", "TESTE_BASE")
    }

    open fun teste() {
        Log.e("LOG", "TESTE_BASE_DOIS")
    }

    open fun testeBitrise() {
        Log.e("LOG", "TESTE_BASE_BITRISE")
    }
}
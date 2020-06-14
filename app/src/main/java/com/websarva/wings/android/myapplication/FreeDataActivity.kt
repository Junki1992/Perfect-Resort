package com.websarva.wings.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FreeDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_free_data)
    }

    //戻るボタンがタップされた時の処理。
    fun onBackButtonClick(view: View) {
        finish()
    }
}

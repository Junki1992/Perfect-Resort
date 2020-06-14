package com.websarva.wings.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WorkingPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_working_page)
    }

    //戻るボタンをタップした時の処理。
    fun onBackButtonClick(view: View) {
        finish()
    }
}

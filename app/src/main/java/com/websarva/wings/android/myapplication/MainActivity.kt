package com.websarva.wings.android.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //語学留学ボタンのButtonオブジェクトを取得。
        val btStudy = findViewById<Button>(R.id.btStudy)
        //ワーホリボタンのButtonのオブジェクトを取得。
        val btWork = findViewById<Button>(R.id.btWork)
        //ホームステイボタンのButtonオブジェクトを取得。　
        val btHome = findViewById<Button>(R.id.btHome)
        //選ばれる理由ボタンのButtonオブジェクトを取得。
        val btSelected = findViewById<Button>(R.id.btSelected)
        //無料カウンセリングのButtonオブジェクトを取得。
        val btCounseling = findViewById<Button>(R.id.btCounseling)
        //無料資料請求のButtonオブジェクトを取得。
        val btFreeData = findViewById<Button>(R.id.btFreeData)

        //リスナクラスのインスタンスを生成。
        val listener = ButtonClickListener()

        //語学留学ボタンにリスナを設定。
        btStudy.setOnClickListener(listener)
        //ワーホリボタンにリスナを設定。
        btWork.setOnClickListener(listener)
        //ホームステイボタンにリスナクラスを設定。
        btHome.setOnClickListener(listener)
        //選ばれる理由ボタンにリスナを設定。
        btSelected.setOnClickListener(listener)
        //無料カウンセリングボタンにリスナを設定。
        btCounseling.setOnClickListener(listener)
        //無料資料請求ボタンにリスナを設定。
        btFreeData.setOnClickListener(listener)
    }

    private inner class ButtonClickListener : View.OnClickListener {
        override fun onClick(view: View) {

            //R値のidに応じて処理を分岐。
            when(view.id) {
                //語学留学ボタンの場合。
                R.id.btStudy -> {
                    //語学留学画面のインテントオブジェクトを生成。
                    val intentStudy = Intent(applicationContext, StudyPageActivity::class.java)
                    //画面の起動。
                    startActivity(intentStudy)
                }
                //ワーホリの場合。
                R.id.btWork -> {
                    //ワーホリ画面のインテントオブジェクトを生成。
                    val intentWork = Intent(applicationContext, WorkingPageActivity::class.java)
                    //画面の起動。
                    startActivity(intentWork)
                }
                //ホームステイの場合。
                R.id.btHome -> {
                    //ホームステイ画面のインテントオブジェクトを生成。
                    val intenHome = Intent(applicationContext, HomePageActivity::class.java)
                    //画面の起動。
                    startActivity(intenHome)
                }
                //選ばれる理由の場合。
                R.id.btSelected -> {
                    val intentReasons = Intent(applicationContext, SelectedReasonsActivity::class.java)
                    //画面の起動。
                    startActivity(intentReasons)
                }
                //無料カウンセリングボタンの場合。
                R.id.btCounseling -> {
                    val intentCounseling = Intent(applicationContext, CounselingActivity::class.java)
                    //画面の起動。
                    startActivity(intentCounseling)
                }
                //無料資料請求ボタンの場合。
                R.id.btFreeData -> {
                    val intentFreeData = Intent(applicationContext, FreeDataActivity::class.java)
                    //画面の起動。
                    startActivity(intentFreeData)
                }
            }

            //第2画面のインテントオブジェクトを生成。
//            val intent2 = Intent(applicationContext, StudyPageActivity::class.java)
//            //第2画面の起動。
//            startActivity(intent2)

//            //第3画面のインテントオブジェクトを生成。
//            val intent3 = Intent(applicationContext, WorkingPageActivity::class.java)
//            //第3画面の起動。
//            startActivity(intent3)
        }
    }
}

package com.tjoeun.sj20191201_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//XML 불러오는 역할
//        (okBtn) 버튼이 눌리면
//        EditTxt (inputEdt)에 적힌 값(text)을 받아서
//        TextView의 (resultTxt)내용으로 반영

        okBtn.setOnClickListener {
            inputEdt.text.toString()
            var inputString = inputEdt.text.toString()
            resultTxt.text = inputString

        }
    }
}

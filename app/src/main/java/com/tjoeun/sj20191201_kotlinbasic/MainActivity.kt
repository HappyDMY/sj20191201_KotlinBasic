package com.tjoeun.sj20191201_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//XML 불러오는 역할
//        (okBtn) 버튼이 눌리면
//        EditTxt (inputEdt)에 적힌 값(text)을 받아서
//        TextView의 (resultTxt)내용으로 반영

        okBtn.setOnClickListener {
            var inputString = inputEdt.text.toString() // get 내용물 받아오기.
            resultTxt.text = inputString // set 내용물 설정하기.

//            확인버튼이 눌렸는지 로크
            Log.d("확인버튼 클릭", inputString)

        }

        okBtn.setOnLongClickListener {
            resultTxt.text = "초기상태"

            Log.d("확인버튼 클릭","텍스트뷰 초기화")
            return@setOnLongClickListener true //롱클릭이 됐을 때 온클릭 무시 여부
        }

        var int:Int

    }
}

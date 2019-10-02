package com.sample.korea.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sample.korea.R
import com.sample.korea.mock.aChildMock
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val child = aChildMock()

        go_button.setOnClickListener {
            startActivity(Intent().also {
                it.putExtra("CHILD", child)
                it.setClass(this, SecondActivity::class.java)
            })
        }
    }
}

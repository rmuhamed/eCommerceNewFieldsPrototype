package com.sample.korea.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sample.korea.R
import com.sample.korea.model.Child
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        label.text = intent.extras?.let {
            it.getParcelable<Child>("CHILD")!!.label
        }

        label.setOnClickListener {
            this.startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}

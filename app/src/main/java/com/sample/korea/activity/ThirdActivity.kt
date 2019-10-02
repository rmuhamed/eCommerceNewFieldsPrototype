package com.sample.korea.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sample.korea.R
import com.sample.korea.mock.aTaxNumberField
import com.sample.korea.view.TaxNumberView
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        third_activity_container.addView(
            TaxNumberView(
                aTaxNumberField(),
                this
            )
        )
    }
}

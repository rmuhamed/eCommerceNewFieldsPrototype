package com.sample.korea.view

import android.content.Context
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.widget.LinearLayoutCompat
import com.google.android.material.textfield.TextInputLayout
import com.sample.korea.R
import com.sample.korea.model.TaxNumberItemField

class TaxNumberItemView(
    _taxNumberItemField: TaxNumberItemField,
    _taxNumberItemViewId: Int,
    _defaultChecked: Boolean,
    radioCheckHandler: RadioButtonCheckHandler,
    context: Context
) : LinearLayoutCompat(context) {

    var taxNumberItemViewId = _taxNumberItemViewId
    private var radioButton: RadioButton
    private var taxNumberItemField: TaxNumberItemField = _taxNumberItemField
    private var checked: Boolean = _defaultChecked

    init {
        val view = inflate(context, R.layout.tax_number_item, this)

        val textField = view.findViewById<TextInputLayout>(R.id.text_input_field)
        textField.hint = taxNumberItemField.child.label
        textField.helperText = taxNumberItemField.child.helperText

        radioButton = view.findViewById(R.id.radio_button)
        radioButton.text = taxNumberItemField.label
        radioButton.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                textField.visibility = View.VISIBLE
                radioCheckHandler.onRadioButtonChecked(this.taxNumberItemViewId)
            } else {
                textField.visibility = View.GONE
            }
        }
        radioButton.isChecked = checked
    }

    fun uncheck() {
        radioButton.isChecked = false
    }
}
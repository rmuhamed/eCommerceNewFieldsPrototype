package com.sample.korea.view

import android.content.Context
import androidx.appcompat.widget.LinearLayoutCompat
import com.sample.korea.R
import com.sample.korea.model.TaxNumberField

class TaxNumberView(_field: TaxNumberField, context: Context)
    : LinearLayoutCompat(context), RadioButtonCheckHandler {

    private var viewItems: MutableList<TaxNumberItemView> = mutableListOf()
    private var field: TaxNumberField = _field

    init {
        val containerView = inflate(context,
            R.layout.tax_number_container_layout, this)
                    as LinearLayoutCompat

        containerView.orientation = VERTICAL

        var  count = containerView.childCount
        var id = 0
        field.items.forEach {
            val viewItem = TaxNumberItemView(
                it,
                id++,
                it.id == field.defaultSelectedId,
                this,
                context
            )
            viewItems.add(viewItem)
            this.addView(viewItem, count++)
        }
    }

    override fun onRadioButtonChecked(id: Int) {
        //Notify others
        viewItems.filter{ it.taxNumberItemViewId != id }.map { it.uncheck() }
    }
}
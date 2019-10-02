package com.sample.korea.mock

import com.sample.korea.model.Child
import com.sample.korea.model.TaxNumberField
import com.sample.korea.model.TaxNumberItemField
import com.sample.korea.model.TextItemField

fun aChildMock(): Child = Child("1", "Child")

fun aTaxNumberField() : TaxNumberField {
    val item1 = TaxNumberItemField(
        "1",
        "Registration number",
        TextItemField("1", "Your Reg Number goes here ...", "10 digits number")
    )
    val item2 = TaxNumberItemField(
        "2",
        "Birthday",
        TextItemField("2", "Your birthday goes here ...", "Expected format YYYYMMDD")
    )

    return TaxNumberField("1", "Tax Number", "2", listOf(item1, item2))
}
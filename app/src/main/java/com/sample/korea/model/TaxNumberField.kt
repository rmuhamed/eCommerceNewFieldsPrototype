package com.sample.korea.model

data class TaxNumberField(
    val id: String,
    val label: String,
    val defaultSelectedId: String,
    val items: List<TaxNumberItemField>
)
package id.kotlin.basicmvvm

import androidx.databinding.ObservableInt

data class MainModel(
    val name: String,
    val count: ObservableInt
)
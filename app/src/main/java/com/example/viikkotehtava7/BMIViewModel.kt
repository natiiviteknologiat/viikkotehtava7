package com.example.viikkotehtava7

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class BMIViewModel : ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")
    var bmiResult by mutableStateOf("")

    fun calculateBMI() {
        val height = heightInput.toFloatOrNull() ?: 0.0f
        val weight = weightInput.toFloatOrNull() ?: 0.0f

        val bmi = if (weight > 0 && height > 0) weight / (height * height) else 0.0f
        bmiResult = String.format("%.2f", bmi).replace(',','.')
    }
}

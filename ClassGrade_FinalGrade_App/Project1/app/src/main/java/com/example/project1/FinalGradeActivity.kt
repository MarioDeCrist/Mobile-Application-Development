package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_final_grade_calculator.*

class FinalGradeActivity : AppCompatActivity() {

    var currentGrade: EditText? = null
    var finalGrade: EditText? = null
    var percentFinal: EditText? = null
    var res: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_grade_calculator)

        currentGrade = editTextCurrentGrade as EditText
        finalGrade = editTextFinalScore as EditText
        percentFinal = editTextPercentOfGrade as EditText

        var calculateButton: Button? = button_calculate as Button
        res = textViewResult as TextView
        calculateButton!!.setOnClickListener {
            val currentGrade = currentGrade!!.text.toString().toDouble()
            val finalGrade = finalGrade!!.text.toString().toDouble()
            val percentFinal = percentFinal!!.text.toString().toDouble()

            val grade = (finalGrade-((1-(percentFinal/100))*currentGrade))/(percentFinal/100)

            res!!.text = java.lang.Double.toString(grade)
        }
    }
}

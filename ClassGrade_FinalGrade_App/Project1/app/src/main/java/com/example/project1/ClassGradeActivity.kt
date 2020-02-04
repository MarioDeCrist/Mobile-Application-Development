package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_class_grade_calculator.*

class ClassGradeActivity : AppCompatActivity() {

    var hwWeight: EditText? = null
    var hwGrade: EditText? = null
    var quizWeight: EditText? = null
    var quizGrade: EditText? = null
    var projectWeight: EditText? = null
    var projectGrade: EditText? = null
    var testWeight: EditText? = null
    var testGrade: EditText? = null


    var res: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_grade_calculator)

        hwWeight = editTextHwWeight as EditText
        hwGrade = editTextHwGrade as EditText
        quizWeight = editTextQuizWeight as EditText
        quizGrade = editTextQuizGrade as EditText
        projectWeight = editTextProjectWeight as EditText
        projectGrade = editTextProjectGrade as EditText
        testWeight = editTextTestWeight as EditText
        testGrade = editTextTestGrade as EditText

        var addButton: Button? = addButton as Button
        res = textView_Ans as TextView

        addButton!!.setOnClickListener {
            val hwWeight = hwWeight!!.text.toString().toDouble()
            val hwGrade = hwGrade!!.text.toString().toDouble()
            val quizWeight = quizWeight!!.text.toString().toDouble()
            val quizGrade = quizGrade!!.text.toString().toDouble()
            val projectWeight = projectWeight!!.text.toString().toDouble()
            val projectGrade = projectGrade!!.text.toString().toDouble()
            val testWeight = testWeight!!.text.toString().toDouble()
            val testGrade = testGrade!!.text.toString().toDouble()

            //val sum = (number1 + number2)/2
            val grade = (hwGrade*(hwWeight/100))+(quizGrade*(quizWeight/100))+(projectGrade*(projectWeight/100))+(testGrade*(testWeight/100))

            res!!.text = java.lang.Double.toString(grade)
        }
    }
}
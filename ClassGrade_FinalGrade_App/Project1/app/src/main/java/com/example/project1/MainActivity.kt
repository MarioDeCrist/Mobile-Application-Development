package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gradeCalcBtn.setOnClickListener{
            val intent = Intent(this, ClassGradeActivity::class.java)
            startActivity(intent)
        }

        finalCalcBtn.setOnClickListener{
            val intent = Intent(this, FinalGradeActivity::class.java)
            startActivity(intent)
        }
    }
}

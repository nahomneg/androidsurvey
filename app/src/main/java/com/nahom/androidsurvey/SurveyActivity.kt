package com.nahom.androidsurvey

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SurveyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey)

        val surveyType = intent.getStringExtra("survey_type")

        displayQuestions(surveyType)
    }

    private fun displayQuestions(surveyType: String?) {
        val questionTextView = findViewById<TextView>(R.id.question_text_view)
        val questionTextView2 = findViewById<TextView>(R.id.question_text_view2)
        val questionTextView3 = findViewById<TextView>(R.id.question_text_view3)
//        val questionTextView4 = findViewById<TextView>(R.id.question_text_view4)
//        val questionTextView5 = findViewById<TextView>(R.id.question_text_view5)
        val optionsRadioGroup = findViewById<RadioGroup>(R.id.options_radio_group)
        val optionsRadioGroup2 = findViewById<RadioGroup>(R.id.options_radio_group2)
        val optionsRadioGroup3 = findViewById<RadioGroup>(R.id.options_radio_group3)
//        val optionsRadioGroup4 = findViewById<RadioGroup>(R.id.options_radio_group4)
//        val optionsRadioGroup5 = findViewById<RadioGroup>(R.id.options_radio_group5)

        when (surveyType) {
            "Food Preferences" -> {
                questionTextView.text = "What is your favorite cuisine?"
                questionTextView2.text = "How often do you eat out?"
                questionTextView3.text = "Do you prefer spicy food?"
//                questionTextView4.text = "Do you prefer vegetarian food?"
//                questionTextView5.text = "Do you like seafood?"
                addOptions(optionsRadioGroup, arrayOf("Italian", "Chinese", "Mexican", "Indian"))
                addOptions(optionsRadioGroup2, arrayOf("Never", "Rarely", "Sometimes", "Frequently"))
                addOptions(optionsRadioGroup3, arrayOf("Yes", "No"))
//                addOptions(optionsRadioGroup4, arrayOf("Yes", "No"))
//                addOptions(optionsRadioGroup5, arrayOf("Yes", "No"))
            }
            "Dietary Habits" -> {
                questionTextView.text = "Are you vegetarian?"
                questionTextView2.text = "Do you prefer organic food?"
                questionTextView3.text = "Do you consume dairy products?"
                addOptions(optionsRadioGroup, arrayOf("Yes", "No"))
                addOptions(optionsRadioGroup2, arrayOf("Yes", "No"))
                addOptions(optionsRadioGroup3, arrayOf("Yes", "No"))
            }
        }
    }

    private fun addOptions(optionsRadioGroup: RadioGroup, options: Array<String>) {
        for (option in options) {
            val radioButton = RadioButton(this)
            radioButton.text = option
            radioButton.textSize = 12f
            optionsRadioGroup.addView(radioButton)
        }
    }
}

package com.nahom.androidsurvey

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var foodPreferencesButton: Button
    private lateinit var dietaryHabitsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodPreferencesButton = findViewById(R.id.food_preferences_button)
        dietaryHabitsButton = findViewById(R.id.dietary_habits_button)

        foodPreferencesButton.setOnClickListener {
            startSurveyActivity("Food Preferences")
        }

        dietaryHabitsButton.setOnClickListener {
            startSurveyActivity("Dietary Habits")
        }
    }

    private fun startSurveyActivity(surveyType: String) {
        val intent = Intent(this@MainActivity, SurveyActivity::class.java)
        intent.putExtra("survey_type", surveyType)
        startActivity(intent)
    }
}

package com.plcoding.sqldelightcrashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.plcoding.sqldelightcrashcourse.ui.PersonListScreen
import com.plcoding.sqldelightcrashcourse.ui.theme.SQLDelightCrashCourseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SQLDelightCrashCourseTheme {
                PersonListScreen()
            }
        }
    }
}

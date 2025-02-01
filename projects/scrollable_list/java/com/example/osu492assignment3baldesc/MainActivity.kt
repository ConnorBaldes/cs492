/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.osu492assignment3baldesc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.osu492assignment3baldesc.data.Datasource
import com.example.osu492assignment3baldesc.model.Course
import com.example.osu492assignment3baldesc.ui.theme.CourseTheme
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.FontWeight


//CS 492 HW3
//Connor Baldes

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseApp()
                }
            }
        }
    }
}

@Composable
fun CourseApp() {
    CourseList(
        courseList = Datasource().loadCourses(),
    )
}

@Composable
fun CourseList(courseList: List<Course>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(courseList) { Course ->
            CourseCard(
                course = Course,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun CourseCard(course: Course, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier.padding(16.dp),

        ) {
            // First line: Department and Number
            Text(
                text = "${LocalContext.current.getString(course.department)} ${LocalContext.current.getString(course.number)}",
                fontWeight = FontWeight.Bold
            )

            // Second line: Title of the Course
            Text(
                text = LocalContext.current.getString(course.title),

            )

            // Third line: Capacity of the Course
            Text(
                text = "Capacity: ${LocalContext.current.getString(course.capacity)}",

            )
        }
    }
}

@Preview
@Composable
private fun CourseCardPreview() {

}

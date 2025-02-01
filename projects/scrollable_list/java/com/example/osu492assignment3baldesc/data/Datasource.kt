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
package com.example.osu492assignment3baldesc.data

import com.example.osu492assignment3baldesc.R
import com.example.osu492assignment3baldesc.model.Course

/**
 * [Datasource] generates a list of [Course]
 */
class Datasource() {
    fun loadCourses(): List<Course> {
        return listOf<Course>(
            Course(R.string.title_0, R.string.department_0, R.integer.number_0, R.integer.capacity_0),
            Course(R.string.title_1, R.string.department_1, R.integer.number_1, R.integer.capacity_1),
            Course(R.string.title_2, R.string.department_2, R.integer.number_2, R.integer.capacity_2),
            Course(R.string.title_3, R.string.department_3, R.integer.number_3, R.integer.capacity_3),
            Course(R.string.title_4, R.string.department_4, R.integer.number_4, R.integer.capacity_4),
            Course(R.string.title_5, R.string.department_5, R.integer.number_5, R.integer.capacity_5),
            Course(R.string.title_6, R.string.department_6, R.integer.number_6, R.integer.capacity_6),
            Course(R.string.title_7, R.string.department_7, R.integer.number_7, R.integer.capacity_7),
            Course(R.string.title_8, R.string.department_8, R.integer.number_8, R.integer.capacity_8),
            Course(R.string.title_9, R.string.department_9, R.integer.number_9, R.integer.capacity_9),
            Course(R.string.title_10, R.string.department_10, R.integer.number_10, R.integer.capacity_10),
            Course(R.string.title_11, R.string.department_11, R.integer.number_11, R.integer.capacity_11),
            Course(R.string.title_12, R.string.department_12, R.integer.number_12, R.integer.capacity_12),
            )

    }
}

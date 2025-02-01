package com.example.mycityapp.data

import androidx.annotation.StringRes
import com.example.mycityapp.R
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Recommendation

data class UiState (

    @StringRes val headerTitleId: Int = R.string.app_name,
    val currentCategory: Category = DataSource.defaultCategory,
    val categoryList: List<Category> = emptyList(),
    val currentRecommendation: Recommendation = DataSource.defaultRecommendation,
    val recommendationList: List<Recommendation> = emptyList(),
    val isShowingListPage: Boolean = true
)
package com.example.mycityapp.ui

import androidx.annotation.StringRes
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R
import com.example.mycityapp.data.DataSource
import com.example.mycityapp.data.UiState
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Recommendation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState(categoryList = DataSource.getCategoryData()))
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()


    fun setCategory(selectedCategory: Category) {
        _uiState.update {
            it.copy(
                currentCategory = selectedCategory,
                headerTitleId = selectedCategory.name
            )
        }
        updateRecommendationListData(selectedCategory.name)
    }

    fun setRecommendation(selectedRecommendation: Recommendation) {
        _uiState.update {
            it.copy(currentRecommendation = selectedRecommendation)
        }
    }

    private fun updateRecommendationListData(@StringRes categoryTitleId: Int) {

        val recommendationList: List<Recommendation> = when (categoryTitleId) {
            R.string.restaurant_category -> DataSource.getRestaurantData()
            R.string.park_category -> DataSource.getParkData()
            R.string.coffee_category -> DataSource.getCoffeeShopData()
            else -> DataSource.getRestaurantData()
        }

        _uiState.update {
            it.copy(recommendationList = recommendationList)
        }
    }
}
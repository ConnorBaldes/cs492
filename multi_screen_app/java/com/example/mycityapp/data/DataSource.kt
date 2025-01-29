package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Recommendation

object DataSource {
    val defaultRecommendation: Recommendation = getRestaurantData()[0]

    fun getRestaurantData(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 1,
                name = R.string.Fogo_De_Chao_name,
                address = R.string.Fogo_De_Chao_address,
                description = R.string.Fogo_De_Chao_description,
                image = R.drawable.restaurant_1
            ),
            Recommendation(
                id = 2,
                name = R.string.Melting_Pot_name,
                address = R.string.Melting_Pot_address,
                description = R.string.Melting_Pot_description,
                image = R.drawable.restaurant_2
            ),
            Recommendation(
                id = 3,
                name = R.string.Portland_City_Grill_name,
                address = R.string.Portland_City_Grill_address,
                description = R.string.Portland_City_Grill_description,
                image = R.drawable.restaurant_3
            ),
            Recommendation(
                id = 4,
                name = R.string.Ringside_Steakhouse_name,
                address = R.string.Ringside_Steakhouse_address,
                description = R.string.Ringside_Steakhouse_description,
                image = R.drawable.restaurant_4
            )
        )
    }

    fun getParkData(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 5,
                name = R.string.pittock_mansion_name,
                address = R.string.pittock_mansion_address,
                description = R.string.pittock_mansion_description,
                image = R.drawable.park_1
            ),
            Recommendation(
                id = 6,
                name = R.string.laurelhurst_park_name,
                address = R.string.laurelhurst_park_address,
                description = R.string.laurelhurst_park_description,
                image = R.drawable.park_2
            ),
            Recommendation(
                id = 7,
                name = R.string.forest_park_name,
                address = R.string.forest_park_address,
                description = R.string.forest_park_description,
                image = R.drawable.park_3
            ),
            Recommendation(
                id = 8,
                name = R.string.washington_park_name,
                address = R.string.washington_park_address,
                description = R.string.washington_park_description,
                image = R.drawable.park_4
            )
        )
    }

    fun getCoffeeShopData(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 9,
                name = R.string.futura_name,
                address = R.string.futura_address,
                description = R.string.futura_description,
                image = R.drawable.coffee_1
            ),
            Recommendation(
                id = 10,
                name = R.string.puff_name,
                address = R.string.puff_address,
                description = R.string.puff_description,
                image = R.drawable.coffee_2
            ),
            Recommendation(
                id =11,
                name = R.string.sterling_name,
                address = R.string.sterling_address,
                description = R.string.sterling_description,
                image = R.drawable.coffee_3
            ),
            Recommendation(
                id = 12,
                name = R.string.never_name,
                address = R.string.never_address,
                description = R.string.never_description,
                image = R.drawable.coffee_4
            )
        )
    }

    val defaultCategory: Category = getCategoryData()[0]
    fun getCategoryData(): List<Category> {
        return listOf(
            Category(
                name = R.string.restaurant_category,
                icon = R.drawable.restaurant_icon
            ),
            Category(
                name = R.string.park_category,
                icon = R.drawable.park_icon
            ),
            Category(
                name = R.string.coffee_category,
                icon = R.drawable.coffee_icon
            )
        )
    }
}
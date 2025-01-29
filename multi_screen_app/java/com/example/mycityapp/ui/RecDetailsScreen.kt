package com.example.mycityapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.MyCityAppTheme
import com.example.mycityapp.data.DataSource
import com.example.mycityapp.model.Recommendation

@Composable
fun DetailsScreen(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(12.dp),
        shape = RoundedCornerShape(12.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = recommendation.name),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Image(
                painter = painterResource(id = recommendation.image),
                contentDescription = stringResource(id = recommendation.name),
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = recommendation.address),
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = stringResource(id = recommendation.description),
            )
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    MyCityAppTheme {
        Scaffold(
            topBar = {
                MyCityAppBar(
                    canNavigateBack = true,
                    headerResId = DataSource.defaultCategory.name,
                    currentScreen = MyCityScreen.DETAIL
                )
            }
        ) { innerPadding ->
            DetailsScreen(
                recommendation = DataSource.defaultRecommendation,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
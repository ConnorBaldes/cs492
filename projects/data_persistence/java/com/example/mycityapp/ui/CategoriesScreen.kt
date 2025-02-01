package com.example.mycityapp.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.MyCityAppTheme
import com.example.mycityapp.R
import com.example.mycityapp.data.DataSource
import com.example.mycityapp.model.Category

@Composable
fun CategoryListScreen(
    categoryList: List<Category>,
    modifier: Modifier = Modifier,
    onCardClick: (Category) -> Unit,
) {
    LazyColumn(modifier = modifier) {
        items(categoryList) { category ->
            CategoryCard(
                category = category,
                selected = false,
                onCardClick = { onCardClick(category) },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryCard(
    category: Category,
    selected: Boolean,
    onCardClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clickable { onCardClick(category) }
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = category.icon),
                contentDescription = null,
                modifier = Modifier
                    .size(32.dp)
                    .clip(MaterialTheme.shapes.small)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = stringResource(id = category.name),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryCardPreview() {
    MyCityAppTheme {
        CategoryCard(
            category = DataSource.defaultCategory,
            selected = false,
            onCardClick = {}
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun CategoryListContentPreview() {
    MyCityAppTheme {

        Scaffold(
            topBar = {
                MyCityAppBar(
                    canNavigateBack = false,
                    headerResId = R.string.app_name,
                    currentScreen = MyCityScreen.CATEGORY
                )
            }
        ) { innerPadding ->
            CategoryListScreen(
                categoryList = DataSource.getCategoryData(),
                onCardClick = { Category -> },
                modifier = Modifier
                    .padding(innerPadding)
            )
        }

    }
}

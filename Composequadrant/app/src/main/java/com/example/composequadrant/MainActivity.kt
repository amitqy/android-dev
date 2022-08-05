package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ContentCard(
                title = stringResource(id = R.string.card_title_1),
                content = stringResource(id = R.string.card_content_1),
                modifier = Modifier.weight(1f)
            )

            ContentCard(
                title = stringResource(id = R.string.card_title_1),
                content = stringResource(id = R.string.card_content_1),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {

            ContentCard(
                title = stringResource(id = R.string.card_title_1),
                content = stringResource(id = R.string.card_content_1),
                modifier = Modifier.weight(1f)
            )

            ContentCard(
                title = stringResource(id = R.string.card_title_1),
                content = stringResource(id = R.string.card_content_1),
                modifier = Modifier.weight(1f)
            )
        }
     }
    }
//
@Composable
fun ContentCard(
    title: String,
    content: String,
    modifier: Modifier =  Modifier
) { Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16 .dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16 .dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   ComposeQuadrantApp()
}
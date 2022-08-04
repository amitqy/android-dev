package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen(getString(R.string.course_title), getString(R.string.para1), getString(R.string.para2))
                }
            }
        }
    }
}

@Composable
fun HomeScreen(title: String, para1: String, para2: String) {
   Column{

       ArticleImage()
       Text(
           text = title,
           fontSize = 24 .sp,
           modifier = Modifier.padding(16 .dp)
       )

       Text(
           text = para1,
           modifier = Modifier
               .padding(start = 16 .dp, end = 16 .dp),
           textAlign = TextAlign.Justify
       )
       Text(
           text = para2,
           modifier = Modifier
               .padding(16 .dp),
           textAlign = TextAlign.Justify
       )

   }
}


@Composable
fun ArticleImage(){
    val image = painterResource(R.drawable.learntogether)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        HomeScreen(title = stringResource(id = R.string.course_title), para1 = stringResource(id = R.string.para1),
            para2 = stringResource(id = R.string.para2))
    }
}
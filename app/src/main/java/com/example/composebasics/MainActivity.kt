package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    ComposeArticle(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    TaskManager(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "Image"
        )
        Text(
            text = stringResource(R.string.jetpack_compose_title),
            style = TextStyle(fontSize = 24.sp),
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = stringResource(R.string.jetpack_compose_first_paragraph),
            style = TextStyle(textAlign = TextAlign.Justify),
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = stringResource(R.string.jetpack_compose_second_paragraph),
            style = TextStyle(textAlign = TextAlign.Justify),
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    Column {
        Surface(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.ic_task_completed),
                        modifier = Modifier.size(150.dp, 150.dp),
                        contentScale = ContentScale.Fit,
                        contentDescription = "icon"
                    )
                    Text(
                        text = stringResource(R.string.task_manager_completed),
                        style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                        modifier = modifier
                            .padding(top = 24.dp, bottom = 8.dp)
                    )
                    Text(
                        text = stringResource(R.string.task_manager_nice_work),
                        style = TextStyle(fontSize = 16.sp),
                        modifier = modifier
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeBasicsTheme {
        //ComposeArticle()
        //TaskManager()
        ComposeQuadrant()
    }
}
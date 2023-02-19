package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme
import org.intellij.lang.annotations.JdkConstants.TitledBorderJustification

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ComposeArticleWithText(firstText: String, secondText: String, threeText: String) {
    Column() {

        Text(
            text = firstText,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(all = 16.dp),

        )

        Text(
            text = secondText,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify


        )

        Text(
            text = threeText,
            modifier = Modifier
                .padding(all = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeArticleWithImage(
    firstText: String, secondText: String, threeText: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null
        )
        ComposeArticleWithText(firstText = stringResource(R.string.first_text),
            secondText = stringResource(R.string.second_text),
            threeText = stringResource(R.string.three_text))
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleWithImage(
        stringResource(R.string.first_text), stringResource(
            R.string.second_text
        ), stringResource(R.string.three_text)
    )

}
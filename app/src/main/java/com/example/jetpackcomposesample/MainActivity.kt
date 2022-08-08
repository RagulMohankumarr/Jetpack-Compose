package com.example.jetpackcomposesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposesample.ui.theme.JetpackComposeSampleTheme

class MainActivity : ComponentActivity() {
    val fonts = FontFamily(Font(R.font.oleoscriptbold, FontWeight.Bold),
        Font(R.font.oleoscriptregular, FontWeight.Normal),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxSize()
            )
            {
                Text(
                    text = buildAnnotatedString {
                                                withStyle(
                                                    style = SpanStyle(
                                                        color = Color.Yellow,
                                                        fontSize = 30.sp
                                                    )
                                                )
                                                {
                                                    append("J")
                                                }
                        append("et")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 30.sp
                            )
                        )
                        {
                            append("C")
                        }
                        append("ompose")
                        withStyle(
                            style = SpanStyle(
                                color = Color.White,
                                fontSize = 30.sp
                            )
                        )
                        {
                            append("T")
                        }
                        append("ext")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Gray,
                                fontSize = 30.sp
                            )
                        )
                        {
                            append("S")
                        }
                        append("tyling")

                    },
                    color = Color.Black,
                    fontSize = 30.sp,
                    fontFamily = fonts,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                )
            }
        }
    }
}


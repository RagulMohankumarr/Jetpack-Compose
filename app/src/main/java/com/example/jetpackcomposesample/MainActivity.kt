package com.example.jetpackcomposesample

import android.animation.Keyframe
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.jetpackcomposesample.ui.theme.JetpackComposeSampleTheme
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressBar(percentage = 0.8f, number = 100)
            }
        }
    }

    @Composable
    fun CircularProgressBar(
        percentage: Float,
        number: Int,
        fontSize: TextUnit = 28.sp,
        radius: Dp = 50.dp,
        color: Color = Color.Green,
        strokeWidth: Dp = 8.dp,
        animDuration: Int = 1000,
        animDelay: Int = 0
    ) {
        var animPlayed by remember {
            mutableStateOf(false)
        }
        val curPercentage = animateFloatAsState(
            targetValue = if (animPlayed) percentage else 0f,
            animationSpec = tween(
                durationMillis = animDuration,
                delayMillis = animDelay
            )
        )
        LaunchedEffect(key1 = 1) {
            animPlayed = true
        }
        Box(modifier = Modifier.size(radius * 2), contentAlignment = Alignment.Center) {
            Log.i("check","CurPercentage:${curPercentage.value}")
            Canvas(modifier = Modifier.size(radius * 2)) {
                drawArc(
                    color = color,
                    90f,
                    360 * curPercentage.value,
                    useCenter = false,
                    style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
                )
            }
            Text(
                text = (curPercentage.value * number).toInt().toString(),
                color = Black,
                fontSize = fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}




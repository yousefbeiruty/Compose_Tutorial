package com.example.composetutorial.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Row(
//                modifier = Modifier
//                    .width(200.dp)
//                    .height(300.dp)
//                    .background(Color.White),
//                horizontalArrangement = Arrangement.SpaceAround,
//                verticalAlignment=Alignment.CenterVertically
//            ){
//                Text("Hello")
//                Text(text = "World")
//                Text("Yousef")
//            }

//            Column(
//                modifier = Modifier
//                    .background(Color.White)
//                    .fillMaxHeight(.5f)
//                    .fillMaxWidth()
//                    .padding(top = 50.dp)
//                    .border(5.dp,Color.Magenta)
//                    .padding(5.dp)
//                    .border(5.dp,Color.Green)
//                    .padding(5.dp)
//                    .border(10.dp,Color.Blue)
//                    .padding(10.dp)
//      //              .requiredWidth(600.dp)
//            ) {
//                Text("Hello",
//                    Modifier.border(5.dp, Color.Yellow)
//                        .padding(5.dp)
//                        .offset(20.dp,20.dp)
//                        .border(10.dp,Color.Gray)
//                        .padding(10.dp)
//                        .clickable {
//
//
//                        }
//                )
//                Spacer(modifier = Modifier.height(50.dp))
//                Text("World")
//            }

            val painter = painterResource(id = R.drawable.c)
            val description = "Yousef Learning Compose"
            val title = "Yousef is enjoying learning compose"

            Box(
                modifier =
                Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)
            ) {
                ImageCard(painter = painter, contentDescription = description, title = title)
            }

        }
    }

    @Composable
    fun ImageCard(
        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(modifier = Modifier.fillMaxSize().background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),startY = 300f
                    )
                ))
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
                }
            }
        }

    }

    @Composable
    fun ComposablePreview() {
        val painter = painterResource(id = R.drawable.c)
        val description = "Yousef Learning Compose"
        val title = "Yousef is enjoying learning compose"
        ImageCard(painter = painter, contentDescription = description, title = title)

    }

}

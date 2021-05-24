package com.example.composetutorial.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class ListComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
 //           val scrollState= rememberScrollState()
//            Column(modifier = Modifier.verticalScroll(scrollState)) {
//                for (i in 1..50){
//                    Text(
//                        text = "Item $i",
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign= TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//            }

            LazyColumn {
                itemsIndexed(
                    listOf("This","is","Jetpack","Compose")
                ){index,string->
                    Text(
                        text = string,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign= TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                    )
                }
//                items(5000){
//                    Text(
//                        text = "Item $it",
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign= TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
            }
        }
    }
}



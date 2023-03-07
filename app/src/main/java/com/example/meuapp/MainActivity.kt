package com.example.meuapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meuapp.ui.theme.MeuAppTheme
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        Text(text = "Palmeiras Não",
                            fontSize = 36.sp)
                         Greeting("Mundial")
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Botão",
                                fontSize = 36.sp)

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Tem $name",
        fontSize = 36.sp)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyDefaut() {
    MeuAppTheme {
        Column() {
            Text(text = "Palmeiras Não",
                fontSize = 36.sp)
            Greeting("Mundial!")
           TextButton(onClick = { /*TODO*/ }) {
               Text(text = "Botão",
               fontSize = 36.sp)
               
           }
        }
    }


}
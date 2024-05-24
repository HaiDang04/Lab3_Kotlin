package com.example.lab3_kotlin

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import coil.compose.AsyncImage

class Bai5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetLayout()
        }
    }

    @Preview
    @Composable
    fun GetLayout (title: String = "Trang chu") {

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp)
        ){
            GetTextTitle(title = title)

            GetRowItem(color = Color.Yellow, "https://upload.wikimedia.org/wikipedia/commons/2/20/FPT_Polytechnic.png", "paypal")
            GetRowItem(color = Color.Cyan, "https://gcs.tripi.vn/public-tripi/tripi-feed/img/475223TdJ/anh-mo-ta.png", "momo")
            GetRowItem(color = Color.Magenta, "https://images2.thanhnien.vn/528068263637045248/2023/2/15/bong-da-sv-2aa-16764457958392020821477.jpg", "zalo pay")
            GetRowItem(color = Color.DarkGray, "https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2023/3/20/1159566/Bong-Da-Phui.jpg", "vn pay")
        }
    }

    @Composable
    fun GetRowItem (color: Color, linkImage: String, noidungtext: String) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(5.dp)
                .background(color = color, shape = RoundedCornerShape(15.dp))
                .height(50.dp)
                .fillMaxWidth()
        ) {
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = "ten anh"
//            )

            AsyncImage(
                model = linkImage,
                modifier = Modifier
                    .width(60.dp)
                    .padding(5.dp),
                contentDescription = null
            )

            Text(
                text = noidungtext,
                modifier = Modifier
                    .weight(1f)
                    .padding(50.dp, 0.dp, 0.dp, 0.dp),
                color = Color.White
            )

            RadioButton(selected = false, onClick = { /*TODO*/ })
        }
    }

    @Composable
    fun GetTextTitle (title: String) {
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }

}
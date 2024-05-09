package com.example.composembti

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composembti.ui.theme.ComposeMBTITheme

private val Any.body2: TextStyle
    get() = TextStyle.Default
private val Any.h5: TextStyle
    get() = TextStyle.Default
private val Any.body1: TextStyle
    get() = TextStyle.Default
private val Any.h4: TextStyle
    get() = TextStyle.Default

val TextStyle.h4: TextStyle
    get() = this
val TextStyle.body1: TextStyle
    get() = this
val TextStyle.h5: TextStyle
    get() = this
val TextStyle.body2: TextStyle
    get() = this

@Composable
fun INTJScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "INTJ: 전략가 (Strategist)",
            style = MaterialTheme.typography.h4,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "INTJ 유형은 독창적이며, 자기 자신에 대한 확신을 가지고 있는 것으로 유명합니다. 그들은 직관적인 사고와 뛰어난 전략적 사고 능력으로 자신의 목표를 달성하는 것을 좋아합니다.",
            style = MaterialTheme.typography.body1,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "추천 직업:",
            style = MaterialTheme.typography.h5,
            color = Color.Black,
            modifier = Modifier.padding(top = 16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column {
            Text(
                text = "1. 전략 컨설턴트",
                style = MaterialTheme.typography.body2,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "2. 공학자/과학자",
                style = MaterialTheme.typography.body2,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "3. CEO 또는 경영진",
                style = MaterialTheme.typography.body2,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "4. 연구원/학자",
                style = MaterialTheme.typography.body2,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "유명한 INTJ 인물: 니체, 스티븐호킹, 세종대왕, 일론 머스크",
                style = MaterialTheme.typography.body2,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun INTJScreenPreview() {
    ComposeMBTITheme {
        INTJScreen()
    }
}

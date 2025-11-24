package com.example.it4785_android_1811_ex3.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.it4785_android_1811_ex3.data.AppSection

@Composable
fun AppSection(
    section: AppSection,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        // Section Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = section.title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp
            )
            
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (section.isHorizontal) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Scroll",
                        tint = Color.Gray,
                        modifier = Modifier.size(20.dp)
                    )
                } else {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "More options",
                            tint = Color.Gray
                        )
                    }
                }
            }
        }
        
        // App List
        if (section.isHorizontal) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(0.dp)
            ) {
                section.apps.forEach { app ->
                    AppItemHorizontal(app = app)
                }
            }
        } else {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                section.apps.forEach { app ->
                    AppItemVertical(app = app)
                    if (app != section.apps.last()) {
                        HorizontalDivider()
                    }
                }
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun HorizontalDivider() {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .padding(horizontal = 16.dp)
            .background(Color(0xFFE0E0E0))
    )
}


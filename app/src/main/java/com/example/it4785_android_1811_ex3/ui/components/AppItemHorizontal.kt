package com.example.it4785_android_1811_ex3.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.it4785_android_1811_ex3.data.AppItem

@Composable
fun AppItemHorizontal(
    app: AppItem,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(100.dp)
            .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // App Icon
        val context = LocalContext.current
        val drawableId = app.drawableResourceName?.let { name ->
            context.resources.getIdentifier(name, "drawable", context.packageName)
        } ?: 0
        
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(if (drawableId != 0) Color.Transparent else Color(app.iconColor)),
            contentAlignment = Alignment.Center
        ) {
            if (drawableId != 0) {
                Image(
                    painter = painterResource(id = drawableId),
                    contentDescription = app.name,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            } else {
                Text(
                    text = app.name.take(1),
                    color = Color.White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // App Name
        Text(
            text = app.name,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            fontSize = 12.sp
        )
    }
}


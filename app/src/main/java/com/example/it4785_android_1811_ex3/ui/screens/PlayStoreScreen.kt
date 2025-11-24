package com.example.it4785_android_1811_ex3.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.it4785_android_1811_ex3.data.SampleData
import com.example.it4785_android_1811_ex3.ui.components.AppSection

@Composable
fun PlayStoreScreen() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    var selectedBottomNavIndex by remember { mutableIntStateOf(1) }
    
    val tabs = listOf("For you", "Top charts", "Other devices", "Kids")
    
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                selectedIndex = selectedBottomNavIndex,
                onItemSelected = { selectedBottomNavIndex = it }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Top Bar
            TopBar()
            
            // Tabs
            TabRow(
                selectedTabIndex = selectedTabIndex,
                tabs = tabs,
                onTabSelected = { selectedTabIndex = it }
            )
            
            // Content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                SampleData.appSections.forEach { section ->
                    AppSection(section = section)
                }
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Play Store Logo (simplified)
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(Color(0xFF1976D2)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "▶",
                color = Color.White,
                fontSize = 16.sp
            )
        }
        
        Spacer(modifier = Modifier.weight(1f))
        
        // Notification and Profile
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BadgedBox(
                badge = {
                    Badge {
                        Text("1", fontSize = 10.sp)
                    }
                }
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.Gray
                    )
                }
            }
            
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF4CAF50)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "V",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun TabRow(
    selectedTabIndex: Int,
    tabs: List<String>,
    onTabSelected: (Int) -> Unit
) {
    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = Modifier.fillMaxWidth(),
        edgePadding = 0.dp,
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = { onTabSelected(index) },
                text = {
                    Text(
                        text = title,
                        fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 14.sp
                    )
                }
            )
        }
    }
}

@Composable
fun BottomNavigationBar(
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Star, contentDescription = "Games") },
            label = { Text("Games") },
            selected = selectedIndex == 0,
            onClick = { onItemSelected(0) }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Apps") },
            label = { Text("Apps") },
            selected = selectedIndex == 1,
            onClick = { onItemSelected(1) }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Search, contentDescription = "Search") },
            label = { Text("Search") },
            selected = selectedIndex == 2,
            onClick = { onItemSelected(2) }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Favorite, contentDescription = "Books") },
            label = { Text("Books") },
            selected = selectedIndex == 3,
            onClick = { onItemSelected(3) }
        )
    }
}


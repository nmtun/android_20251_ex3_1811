package com.example.it4785_android_1811_ex3.data

object SampleData {
    val appSections = listOf(
        AppSection(
            id = "sponsored",
            title = "Sponsored • Suggested for you",
            isHorizontal = false,
            apps = listOf(
                AppItem(
                    id = "1",
                    name = "Mech Assemble: Zombie Swarm",
                    categories = "Action • Role Playing • Roguelike • Zombie",
                    rating = 4.8f,
                    size = "624 MB",
                    iconColor = 0xFFD32F2F
                ),
                AppItem(
                    id = "2",
                    name = "MU: Hồng Hoả Đao",
                    categories = "Role Playing",
                    rating = 4.8f,
                    size = "339 MB",
                    iconColor = 0xFF424242,
                    drawableResourceName = "mu_hong_hoa_dao"
                ),
                AppItem(
                    id = "3",
                    name = "War Inc: Rising",
                    categories = "Strategy • Tower defense",
                    rating = 4.9f,
                    size = "231 MB",
                    iconColor = 0xFFFF6F00,
                    drawableResourceName = "war_inc"
                ),
                AppItem(
                    id = "4",
                    name = "Clash of Clans",
                    categories = "Strategy • Multiplayer",
                    rating = 4.6f,
                    size = "156 MB",
                    iconColor = 0xFF1976D2,
                    drawableResourceName = "clash_of_clans"
                ),
                AppItem(
                    id = "5",
                    name = "PUBG Mobile",
                    categories = "Action • Battle Royale",
                    rating = 4.5f,
                    size = "1.2 GB",
                    iconColor = 0xFF388E3C,
                    drawableResourceName = "pubg_mobile"
                )
            )
        ),
        AppSection(
            id = "recommended",
            title = "Recommended for you",
            isHorizontal = true,
            apps = listOf(
                AppItem(
                    id = "6",
                    name = "Suno - AI Music &",
                    categories = "Music",
                    rating = 4.7f,
                    size = "45 MB",
                    iconColor = 0xFFFF5722
                ),
                AppItem(
                    id = "7",
                    name = "Claude by Anthropic",
                    categories = "Productivity",
                    rating = 4.8f,
                    size = "12 MB",
                    iconColor = 0xFF795548
                ),
                AppItem(
                    id = "8",
                    name = "DramaBox - Short Drama",
                    categories = "Entertainment",
                    rating = 4.6f,
                    size = "89 MB",
                    iconColor = 0xFFE53935,
                    drawableResourceName = "drama_box"
                ),
                AppItem(
                    id = "9",
                    name = "Pil - AI Assistant",
                    categories = "Productivity",
                    rating = 4.9f,
                    size = "23 MB",
                    iconColor = 0xFF7B1FA2,
                    drawableResourceName = "pil_ai_assistant"
                ),
                AppItem(
                    id = "10",
                    name = "Spotify - Music & Podcasts",
                    categories = "Music & Audio",
                    rating = 4.5f,
                    size = "67 MB",
                    iconColor = 0xFF1DB954,
                    drawableResourceName = "spotify"
                ),
                AppItem(
                    id = "11",
                    name = "Netflix",
                    categories = "Entertainment",
                    rating = 4.4f,
                    size = "34 MB",
                    iconColor = 0xFFE50914,
                    drawableResourceName = "netflix"
                )
            )
        ),
        AppSection(
            id = "trending",
            title = "Trending Apps",
            isHorizontal = true,
            apps = listOf(
                AppItem(
                    id = "12",
                    name = "TikTok",
                    categories = "Social",
                    rating = 4.3f,
                    size = "234 MB",
                    iconColor = 0xFF000000
                ),
                AppItem(
                    id = "13",
                    name = "Instagram",
                    categories = "Social",
                    rating = 4.4f,
                    size = "145 MB",
                    iconColor = 0xFFE4405F
                ),
                AppItem(
                    id = "14",
                    name = "YouTube",
                    categories = "Video Players",
                    rating = 4.5f,
                    size = "78 MB",
                    iconColor = 0xFFFF0000
                ),
                AppItem(
                    id = "15",
                    name = "WhatsApp",
                    categories = "Communication",
                    rating = 4.6f,
                    size = "123 MB",
                    iconColor = 0xFF25D366
                )
            )
        ),
        AppSection(
            id = "new_releases",
            title = "New Releases",
            isHorizontal = false,
            apps = listOf(
                AppItem(
                    id = "16",
                    name = "ChatGPT",
                    categories = "Productivity • AI",
                    rating = 4.9f,
                    size = "15 MB",
                    iconColor = 0xFF10A37F
                ),
                AppItem(
                    id = "17",
                    name = "Midjourney",
                    categories = "Art & Design • AI",
                    rating = 4.8f,
                    size = "28 MB",
                    iconColor = 0xFF1A1A1A
                ),
                AppItem(
                    id = "18",
                    name = "Notion - Notes & Docs",
                    categories = "Productivity",
                    rating = 4.7f,
                    size = "56 MB",
                    iconColor = 0xFF000000
                )
            )
        )
    )
}


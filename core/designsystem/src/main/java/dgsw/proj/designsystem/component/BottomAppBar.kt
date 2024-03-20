package dgsw.proj.designsystem.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dgsw.proj.designsystem.R
import dgsw.proj.designsystem.theme.LightPurple
import dgsw.proj.designsystem.theme.LighterBlack


@Composable
fun BottomNavigationView(
    onLoginRequested: MutableState<Boolean>,
    navController: NavHostController,
    currentRoute: String?,
) {
    val items = listOf(
        BottomNavItem.Center,
        BottomNavItem.Home,
        BottomNavItem.My
    )
    BottomNavigation(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        backgroundColor = Color.White
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.name,
                        modifier = Modifier
                            .size(26.dp),
                        tint = when {
                            currentRoute == "$CARDNEWS/{category}" && item.route == HOME -> LightPurple
                            currentRoute == "$CARDNEWSDETAIL/{id}" && item.route == HOME -> LightPurple
                            currentRoute == item.route -> LightPurple
                            else -> LighterBlack
                        }
                    )
                },
                label = {
                    Text(
                        text = item.name,
                        style = TextStyle(fontSize = dpToSp(9.dp)),
                        color = when {
                            currentRoute == "$CARDNEWS/{category}" && item.route == HOME -> LightPurple
                            currentRoute == "$CARDNEWSDETAIL/{id}" && item.route == HOME -> LightPurple
                            currentRoute == item.route -> LightPurple
                            else -> LighterBlack
                        }
                    )
                },
                selectedContentColor = LightPurple,
                unselectedContentColor = LighterBlack,
                selected = currentRoute == item.route,
                alwaysShowLabel = true,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.id.let {
                            popUpTo(it) {
                                saveState = true
                                inclusive = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
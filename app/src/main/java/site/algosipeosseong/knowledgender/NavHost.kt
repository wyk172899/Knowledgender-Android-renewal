package site.algosipeosseong.knowledgender

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun KnowledgenderNavHost(
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = "",
) {
}
package site.algosipeosseong.knowledgender

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class KnowledgenderApplication : Application() {
}

const val HOME = "home"
const val CARDNEWS = "cardnews"
const val CARDNEWSDETAIL = "cardnewsdetail"
const val CHAT = "chat"
const val MY = "my"
const val CENTER = "center"
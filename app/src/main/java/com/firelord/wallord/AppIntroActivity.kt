package com.firelord.wallord

import com.stephentuso.welcome.BasicPage
import com.stephentuso.welcome.TitlePage
import com.stephentuso.welcome.WelcomeActivity
import com.stephentuso.welcome.WelcomeConfiguration

class AppIntroActivity :WelcomeActivity(){

    override fun configuration(): WelcomeConfiguration {
        return WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.blue_background)
                .page(TitlePage(R.drawable.ic_edit_white,
                        getString(R.string.AppIntroTitle))
                )
                .page(BasicPage(R.drawable.ic_thumb_up_white,
                        getString(R.string.AppIntroPageOneTitle),
                        getString(R.string.AppIntroPageOneInfo))
                        .background(R.color.red_background)
                )
                .page(BasicPage(R.drawable.ic_photo_gray,
                        getString(R.string.AppIntroPageTwoTitle),
                        getString(R.string.AppIntroPageTwoInfo))
                        .background(R.color.purple_background)
                )
                .swipeToDismiss(true)
                .exitAnimation(android.R.anim.fade_out)
                .build()
    }

    fun welcomeKey(): String {
        return "WelcomeScreen"
    }
}
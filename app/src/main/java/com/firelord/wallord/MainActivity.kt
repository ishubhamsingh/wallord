package com.firelord.wallord

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.stephentuso.welcome.WelcomeHelper

class MainActivity : AppCompatActivity() {

    private var welcomeScreen: WelcomeHelper? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_gallery-> {
                message.setText(R.string.title_gallery)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_favourite -> {
                message.setText(R.string.title_favourite)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeScreen = WelcomeHelper(this, AppIntroActivity::class.java)
        welcomeScreen!!.show(savedInstanceState)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        welcomeScreen!!.onSaveInstanceState(outState)
    }
}

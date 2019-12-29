package com.skooverjee.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.skooverjee.swoosh.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun onGetStartedClick(view: View) {
        val leagueIntent = Intent(this, LeagueActivity::class.java)
        startActivity(leagueIntent)
    }

}

package com.skooverjee.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skooverjee.swoosh.R
import com.skooverjee.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.setText("Looking for a $league $skill league near you...")
    }

}

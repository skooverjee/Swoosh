package com.skooverjee.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skooverjee.swoosh.R
import com.skooverjee.swoosh.model.Player
import com.skooverjee.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.setText("Looking for a ${player.league} ${player.skill} league near you...")
    }

}

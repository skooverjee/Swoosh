package com.skooverjee.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.skooverjee.swoosh.R
import com.skooverjee.swoosh.model.Player
import com.skooverjee.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClick(view: View) {
        womenButton.isChecked = false
        coEdButton.isChecked = false

        player.league = if (menButton.isChecked) {
            MEN
        } else { "" }
    }

    fun onWomensClick(view: View) {
        coEdButton.isChecked = false
        menButton.isChecked = false

        player.league = if (womenButton.isChecked) {
            WOMEN
        } else { "" }
    }

    fun onCoEdClick(view: View) {
        menButton.isChecked = false
        womenButton.isChecked = false

        player.league = if (coEdButton.isChecked) {
            COED
        } else { "" }
    }

    fun onLeagueNextClick(view: View) {
        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)

            startActivity(skillIntent)
        } else {
            Toast.makeText(this, SELECT_LEAGUE_PROMPT, Toast.LENGTH_SHORT).show()
        }
    }

}

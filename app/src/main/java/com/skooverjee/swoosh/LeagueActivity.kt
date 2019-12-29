package com.skooverjee.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensClicked(view: View) {
        womenButton.isChecked = false
        coEdButton.isChecked = false

        selectedLeague = if (menButton.isChecked) { MEN } else { "" }
    }

    fun womensClicked(view: View) {
        coEdButton.isChecked = false
        menButton.isChecked = false

        selectedLeague = if (womenButton.isChecked) { WOMEN } else { "" }
    }

    fun coEdClicked(view: View) {
        menButton.isChecked = false
        womenButton.isChecked = false

        selectedLeague = if (coEdButton.isChecked) { COED } else { "" }
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)

            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Select a league to continue.", Toast.LENGTH_SHORT).show()
        }
    }

}

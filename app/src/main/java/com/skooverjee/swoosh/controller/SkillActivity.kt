package com.skooverjee.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.skooverjee.swoosh.R
import com.skooverjee.swoosh.model.Player
import com.skooverjee.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClick(view: View) {
        ballerButton.isChecked = false

        player.skill = if (beginnerButton.isChecked) {
            BEGINNER
        } else {
            ""
        }
    }

    fun onBallerClick(view: View) {
        beginnerButton.isChecked = false

        player.skill = if (ballerButton.isChecked) {
            BALLER
        } else {
            ""
        }
    }

    fun onFinishClick(view: View) {
        if (player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)

            startActivity(finishIntent)
        } else {
            Toast.makeText(this, SELECT_SKILL_PROMPT, Toast.LENGTH_SHORT).show()
        }
    }

}

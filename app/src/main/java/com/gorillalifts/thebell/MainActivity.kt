package com.gorillalifts.thebell

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bellSound = MediaPlayer.create(this, R.raw.bell_sound)
        bellButton.setOnClickListener({ b -> bellSound.start()})
    }

}

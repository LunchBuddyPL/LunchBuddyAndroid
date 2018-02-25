package com.nupli.mlf.lunchbuddies

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        startButton.setOnClickListener {
            Toast.makeText(this, "Hello ${yourName.text}!", Toast.LENGTH_LONG)
                .show()
        }
    }
}

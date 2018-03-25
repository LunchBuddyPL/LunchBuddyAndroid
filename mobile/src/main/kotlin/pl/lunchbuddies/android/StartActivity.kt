package pl.lunchbuddies.android

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

const val EXTRA_MESSAGE_USER_NAME = "pl.lunchbuddies.android.MESSAGE_USER_NAME"

class StartActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        startButton.setOnClickListener {
            val intent = Intent(this, CreateOrJoinActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE_USER_NAME, yourName.text.toString())
            }
            startActivity(intent)
        }
    }
}

package pl.lunchbuddies.android

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_or_join.*

class CreateOrJoinActivity : Activity() {

    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_or_join)

        handleNameMessage()
        setTileClickListeners()
    }

    private fun handleNameMessage() {
        val userName = intent.getStringExtra(EXTRA_MESSAGE_USER_NAME)
        if (userName.isEmpty()) return
        toast = Toast.makeText(this, "Hello $userName!", Toast.LENGTH_LONG)
        toast?.show()
    }

    private fun setTileClickListeners() {
        createGroup.setOnClickListener {
            toast?.cancel()
            toast = Toast.makeText(this, "You've chosen to create new lunch group!", Toast.LENGTH_SHORT)
            toast?.show()
        }

        joinGroup.setOnClickListener { startActivity(Intent(this, JoinGroupActivity::class.java)) }
    }
}

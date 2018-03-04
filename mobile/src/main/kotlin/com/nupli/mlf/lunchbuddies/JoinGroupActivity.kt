package com.nupli.mlf.lunchbuddies

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_join_group.*

class JoinGroupActivity : AppCompatActivity() {

    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_group)
        setSupportActionBar(joinGroupToolbar)

        groupCode.setOnEditorActionListener { textView, actionId, keyEvent ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                toast?.cancel()
                toast = Toast.makeText(this, "Code: ${textView.text}", Toast.LENGTH_SHORT)
                toast?.show()
                true
            } else false
        }
    }
}

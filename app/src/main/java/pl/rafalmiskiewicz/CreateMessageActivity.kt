package pl.rafalmiskiewicz

import android.app.Activity
import android.os.Bundle
import android.view.View

class CreateMessageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
    }

    fun onSendMessage(view: View){

    }
}
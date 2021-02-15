package pl.rafalmiskiewicz

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class CreateMessageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
    }

    fun onSendMessage(view: View){
        var intentt = Intent(this,ReceiveMessageActivity::class.java)
                startActivity(intentt)
    }
}
package pl.rafalmiskiewicz

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CreateMessageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
    }

    fun onSendMessage(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        val textView: TextView = findViewById(R.id.message)
        val messageText: String = textView.text.toString()
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, messageText)
        startActivity(intent)
    }
}
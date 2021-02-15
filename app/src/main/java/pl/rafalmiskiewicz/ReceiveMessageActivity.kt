package pl.rafalmiskiewicz

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiveMessageActivity : Activity() {

    companion object {
        const val EXTRA_MESSAGE: String = "message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)

        val messageText = intent.getStringExtra(EXTRA_MESSAGE)
        val messageView: TextView = findViewById(R.id.message)
        messageView.text=messageText
    }
}
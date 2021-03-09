package pl.rafalmiskiewicz

import android.app.Activity
import android.os.Bundle
import android.view.TextureView
import android.view.View

class StopwatchActivity : Activity() {
    var seconds = 0
    var running = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)
    }

    public fun onClickStart(view: View) {
        running = true
    }

    public fun onClickStop(view: View) {
        running = false
    }

    public fun onClickReset(view: View) {
        running = false
        seconds = 0
    }

    fun runTimer() {
        val textView = findViewById<TextureView>(R.id.time_view)

    }
}
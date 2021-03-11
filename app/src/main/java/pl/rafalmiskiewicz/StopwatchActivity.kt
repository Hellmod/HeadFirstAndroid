package pl.rafalmiskiewicz

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import androidx.core.os.HandlerCompat

class StopwatchActivity : Activity() {
    var seconds:Int = 0
    var running = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)
        runTimer()
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
        val timeView = findViewById<TextView>(R.id.time_view)

        val handler:Handler= HandlerCompat.createAsync(Looper.getMainLooper())
        handler.post(object : Runnable {
            override fun run(){
                val hours: Int = seconds / 3600
                val minutes: Int = (seconds % 3600) / 60
                val secs: Int = seconds % 60
                val time = "$hours:$minutes:$secs"
                timeView.text = time
                if (running) {
                    seconds++
                }
                handler.postDelayed(this,1000)
            }
        })
    }
}
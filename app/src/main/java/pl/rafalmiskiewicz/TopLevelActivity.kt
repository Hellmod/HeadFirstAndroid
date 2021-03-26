package pl.rafalmiskiewicz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TopLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)
    }
}
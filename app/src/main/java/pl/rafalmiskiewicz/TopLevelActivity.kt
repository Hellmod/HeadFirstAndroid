package pl.rafalmiskiewicz

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class TopLevelActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)

        val listView=findViewById<ListView>(R.id.list_option)
        listView.setOnItemClickListener { parent, view, position, id ->
            if (position==0) {
                val intent = Intent(this, DrinkCategoryActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
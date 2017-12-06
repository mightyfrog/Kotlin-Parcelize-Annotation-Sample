package org.mightyfrog.android.kotlinparcelizeannotationsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            Intent(this, SubActivity::class.java).apply {
                putExtra("item", Item("Cat", 12))
                startActivity(this)
            }
        }
    }
}

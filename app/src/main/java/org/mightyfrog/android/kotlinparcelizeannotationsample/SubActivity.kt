package org.mightyfrog.android.kotlinparcelizeannotationsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

/**
 * @author Shigehiro Soejima
 */
class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        textView.text = intent.getParcelableExtra<Item>("item").toString()
    }
}

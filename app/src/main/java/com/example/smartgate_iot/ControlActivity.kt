
package com.example.smartgate_iot

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ControlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_control)

        val btnVolver =
            findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {
            finish()
        }
    }
}

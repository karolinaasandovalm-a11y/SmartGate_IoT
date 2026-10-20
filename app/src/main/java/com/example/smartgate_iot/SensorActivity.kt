
package com.example.smartgate_iot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SensorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sensor)

        val btnSiguiente =
            findViewById<Button>(R.id.btnSiguiente)

        val btnVolver =
            findViewById<Button>(R.id.btnVolver)

        btnSiguiente.setOnClickListener {
            val intent = Intent(
                this,
                ControlActivity::class.java
            )
            startActivity(intent)
        }

        btnVolver.setOnClickListener {
            finish()
        }
    }
}

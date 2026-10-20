
package com.example.smartgate_iot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DescripcionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_descripcion)

        val btnSiguiente =
            findViewById<Button>(R.id.btnSiguiente)

        btnSiguiente.setOnClickListener {
            val intent = Intent(
                this,
                SensorActivity::class.java
            )
            startActivity(intent)
        }

        val btnVolver =
            findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {
            finish()
        }
    }
}

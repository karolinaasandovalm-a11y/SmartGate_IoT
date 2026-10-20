
package com.example.smartgate_iot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private val usuarioDemo = "admin"
    private val contrasenaDemo = "SmartGate2026!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val edtUsuario =
            findViewById<EditText>(R.id.edtUsuario)

        val edtContrasena =
            findViewById<EditText>(R.id.edtContrasena)

        val btnIngresar =
            findViewById<Button>(R.id.btnIngresar)

        val btnVolver =
            findViewById<Button>(R.id.btnVolver)

        btnIngresar.setOnClickListener {

            val usuario =
                edtUsuario.text.toString().trim()

            val contrasena =
                edtContrasena.text.toString()

            if (usuario.isBlank()) {

                edtUsuario.error =
                    "Debes ingresar tu usuario"

                edtUsuario.requestFocus()
                return@setOnClickListener
            }

            if (contrasena.isEmpty()) {

                edtContrasena.error =
                    "Debes ingresar tu contraseña"

                edtContrasena.requestFocus()
                return@setOnClickListener
            }

            if (contrasena.length <= 12) {

                edtContrasena.error =
                    "La contraseña debe tener al menos 13 caracteres"

                edtContrasena.requestFocus()
                return@setOnClickListener
            }

            if (
                usuario == usuarioDemo &&
                contrasena == contrasenaDemo
            ) {

                Toast.makeText(
                    this,
                    "Bienvenido a SmartGate IoT",
                    Toast.LENGTH_SHORT
                ).show()

                val intent = Intent(
                    this,
                    DescripcionActivity::class.java
                )

                startActivity(intent)

            } else {

                Toast.makeText(
                    this,
                    "Usuario o contraseña incorrectos",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        btnVolver.setOnClickListener {
            finish()
        }
    }
}

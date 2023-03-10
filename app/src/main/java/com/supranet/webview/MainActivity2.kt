package com.supranet.webview

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.supranet.webview.databinding.ActivityMain2Binding
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val campo=findViewById<EditText>(R.id.edittext)
        val button2=findViewById<Button>(R.id.button2)

            button2.setOnClickListener {

                // Guardar texto en variable
                val nuevaURL = campo.text

                // Mostrar url temporalmente
                Toast.makeText(this, nuevaURL, Toast.LENGTH_SHORT).show()

                // Enviar nueva URL a activity principal
                val intento1 = Intent(this, MainActivity::class.java)
                intento1.putExtra("direccion", campo.text.toString())
                startActivity(intento1)
                button2.setOnClickListener{
                    finish()
                }
            }
        }
    }
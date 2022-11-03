package com.example.contadorkotlinbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.contadorkotlinbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var contador: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { contar() }
        binding.btnLimpiar.setOnClickListener { limpiar() }

    }

    fun contar(){
        contador++
        binding.textView.text = contador.toString()
        binding.tvPulsado.setText("Has pulsado $contador")
        binding.btnLimpiar.setVisibility(View.VISIBLE)
    }

    fun limpiar(){
        contador = 0
        binding.textView.text = "Contador a 0"
        binding.tvPulsado.setVisibility(View.INVISIBLE)
        binding.btnLimpiar.setVisibility(View.INVISIBLE)

    }
}

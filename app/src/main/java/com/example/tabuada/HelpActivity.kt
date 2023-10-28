package com.example.tabuada

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelpActivity : AppCompatActivity() {

    private lateinit var tv_help: TextView
    private lateinit var btnClose:ImageView

    // Para toda funcao criada, precisa ser declarada no onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        setupView()
        setupListeners()

    }

    // Funcao para fechar a tela help
    fun setupView() {
        btnClose = findViewById(R.id.iv_close)
    }

    // Funcao ao clicar no botao X (fechar)
    fun setupListeners() {
        btnClose.setOnClickListener {
            finish()
        }
    }
}
package com.example.tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.tabuada.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Variavel que inicia o modo Dark Mode
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Funcao que valida se o botao foi acionado
        binding.btnDarkMode.setOnCheckedChangeListener { compoundButton, ischecked ->
            // Se o botao foi acionado, o modo Dark entra em acao
            if (ischecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            // Se o botao nao foi acionado, o modo Dark nao entra em acao
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        // Funcao para limpar a consulta
        binding.btnClean.setOnClickListener {
            // Define o texto dos EdiText como uma String vazia
            binding.etFirstEntry.text.clear()
            binding.etSecondEntry.text.clear()

            // Limpa o TextView do resultado
            binding.tvResultValue.text = ""

            // Reativa a entrada nos EdiText
            binding.etFirstEntry.isFocusable = true
            binding.etSecondEntry.isFocusable = true
            binding.etFirstEntry.isClickable = true
            binding.etSecondEntry.isClickable = true

            // Define o foco para a EdiTextFirst
            binding.etFirstEntry.requestFocus()

        }

        // Adiciona logica para o botao Calcular
        binding.btnCalc.setOnClickListener {
            // Logica para calcular a tabuada
            val num = binding.etFirstEntry.text.toString().toIntOrNull()
            val limite = binding.etSecondEntry.text.toString().toIntOrNull()

            // Realiza uma verificao se a codicao for Verdadeira
            if (num != null && num > 0 && limite != null && limite in 1..10 ){
                // Codigo a ser executado se a condicao do IF for verdadeira
                var contador = 1
                var resultado: Int

                while (contador <= limite){
                    resultado = num * contador
                    binding.tvResultValue.text = "${binding.tvResultValue.text}\nTabuada: $num x $contador = $resultado"
                    contador++

                // Desabilita a entrada nos EdiText
                binding.etFirstEntry.isFocusable = false
                binding.etSecondEntry.isFocusable = false
                binding.etFirstEntry.isClickable = false
                binding.etSecondEntry.isClickable = false

                }
            } else {
                // Codigo a ser executado se a condicao for Falsa
                binding.tvResultValue.text = "Valores inválidos, digite valores maiores que zero."
            }
        }
    }
}
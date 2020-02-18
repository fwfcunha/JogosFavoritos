package com.example.jogosfavoritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvJogos.adapter = JogosAdapter(carregaJogos(), this){
            Toast.makeText(this, it.nome,Toast.LENGTH_LONG).show()
        }
        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun carregaJogos(): List<Jogo>{
       return listOf( godOfWar(),godOfWar(),godOfWar()

       )
    }

    private fun godOfWar(): Jogo {
        return Jogo(
            R.drawable.crash,
            nome = "Crash",
            anoLancamento = 2018,
            descricao = "Jogo toperson")
    }
}

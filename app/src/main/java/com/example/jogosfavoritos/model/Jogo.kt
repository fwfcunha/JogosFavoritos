package com.example.jogosfavoritos.model

data class Jogo(
    var resourceId: Int,
    val nome: String,
    val anoLancamento: Int,
    val descricao: String
)
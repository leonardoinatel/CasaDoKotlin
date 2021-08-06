package br.com.ot5.casadocodigo.autor.dto

import java.time.LocalDateTime

data class AutorResponse(
    val id: Long,
    val nome: String,
    val email: String,
    val descricao: String,
    val createAt: LocalDateTime
)
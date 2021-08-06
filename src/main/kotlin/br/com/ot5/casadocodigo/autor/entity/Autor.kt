package br.com.ot5.casadocodigo.autor.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Autor(
    @Column(nullable = false) val nome: String,
    @Column(nullable = false) val email: String,
    @Column(nullable = false) val descricao: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false)
    val createAt: LocalDateTime = LocalDateTime.now()

    override fun toString(): String {
        return "Autor(nome='$nome', email='$email', descricao='$descricao', id=$id, createAt=$createAt)"
    }
}
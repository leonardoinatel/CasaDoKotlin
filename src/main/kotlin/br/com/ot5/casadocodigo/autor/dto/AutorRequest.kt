package br.com.ot5.casadocodigo.autor.dto

import br.com.ot5.casadocodigo.autor.entity.Autor
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class AutorRequest(@field:NotEmpty val nome: String,
                        @field:NotEmpty @field:Email val email: String,
                        @field:NotEmpty @field:Size(max = 400) val descricao: String) {

    fun toModel(): Autor = Autor(nome, email, descricao)

}
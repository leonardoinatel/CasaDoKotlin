package br.com.ot5.casadocodigo.autor.controller

import br.com.ot5.casadocodigo.autor.dto.AutorRequest
import br.com.ot5.casadocodigo.autor.dto.AutorResponse
import br.com.ot5.casadocodigo.autor.entity.Autor
import br.com.ot5.casadocodigo.autor.repository.AutorRepository
import net.bytebuddy.implementation.bytecode.Throw
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.transaction.Transactional
import javax.validation.Valid

@RestController
@RequestMapping("/api/autores")
class AutorController(val autorRepository: AutorRepository) {

    @PostMapping
    @Transactional
    fun cadastrar(@RequestBody @Valid autorRequest: AutorRequest): ResponseEntity<Autor> {
        val autor = autorRequest.toModel()

        return autorRepository.save(autor).let { response -> ResponseEntity.ok(response) } ?: throw IllegalStateException()
    }

}
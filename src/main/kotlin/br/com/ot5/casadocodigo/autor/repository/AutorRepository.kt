package br.com.ot5.casadocodigo.autor.repository

import br.com.ot5.casadocodigo.autor.entity.Autor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AutorRepository: JpaRepository<Autor, Long>
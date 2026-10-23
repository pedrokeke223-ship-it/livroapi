package br.sp.gov.tec.livrosapi.controller

import br.sp.gov.tec.livrosapi.model.Autor
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/livro")
class AutorController {

    @PostMapping
    fun cadastrarAutor(@RequestBody autor: Autor): ResponseEntity<Autor> {
        return ResponseEntity.status(HttpStatus.CREATED).body(autor)
    }
}
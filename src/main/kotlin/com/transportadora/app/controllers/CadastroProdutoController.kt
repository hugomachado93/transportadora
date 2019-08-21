package com.transportadora.app.controllers

import com.transportadora.app.model.CadastroProduto
import com.transportadora.app.services.CadastroProdutoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/cadastro-produto")
class CadastroProdutoController(@Autowired val cadastroProdutoService: CadastroProdutoService) {

    @PostMapping("/cadastra")
    fun cadastraProduto(@RequestBody cadastroProduto: CadastroProduto) : ResponseEntity<CadastroProduto>{
        cadastroProdutoService.cadastro(cadastroProduto)
        return ResponseEntity.status(HttpStatus.OK).build()
    }

}
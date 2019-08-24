package com.transportadora.app.controllers

import com.transportadora.app.CadastroProdutoDTO
import com.transportadora.app.model.CadastroProduto
import com.transportadora.app.services.CadastroProdutoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cadastro-produto")
class CadastroProdutoController(@Autowired val cadastroProdutoService: CadastroProdutoService) {

    @PostMapping("/cadastra")
    fun cadastraProduto(@RequestBody cadastroProdutoDTO: CadastroProdutoDTO) : ResponseEntity<CadastroProduto>{
        cadastroProdutoService.cadastro(cadastroProdutoDTO)
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @GetMapping("/consulta")
    fun consultaProdutos(@RequestParam(value = "page", defaultValue = "0") page: Int,
                         @RequestParam(value = "linesPerPage") linesPerPage : Int,
                         @RequestParam(value = "orderBy") orderBy : String,
                         @RequestParam(value = "direction") direction : String) {
        cadastroProdutoService.findProdutosPage(page, linesPerPage, orderBy, direction)
    }

}
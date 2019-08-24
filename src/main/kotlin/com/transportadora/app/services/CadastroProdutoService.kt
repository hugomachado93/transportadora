package com.transportadora.app.services

import com.transportadora.app.CadastroProdutoDTO
import com.transportadora.app.model.CadastroProduto
import com.transportadora.app.repositories.CadastroProdutoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class CadastroProdutoService(@Autowired
                             private val cadastroProdutoRepository: CadastroProdutoRepository) {

    fun cadastro(cadastroProdutoDTO: CadastroProdutoDTO) : CadastroProduto {

        val cadastroProduto = CadastroProduto(0, cadastroProdutoDTO.nomeProduto, cadastroProdutoDTO.preco, null)

        return cadastroProdutoRepository.save(cadastroProduto)
    }

    fun findProdutosPage(page : Int, linesPerPage : Int, orderBy : String, direction : String) : Page<CadastroProduto> {
        val pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy)
        return cadastroProdutoRepository.findAll(pageRequest)
    }

}
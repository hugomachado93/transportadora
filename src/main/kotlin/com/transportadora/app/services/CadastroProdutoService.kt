package com.transportadora.app.services

import com.transportadora.app.model.CadastroProduto
import com.transportadora.app.repositories.CadastroProdutoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CadastroProdutoService(@Autowired
                             private val cadastroProdutoRepository: CadastroProdutoRepository) {

    fun cadastro(cadastroProduto: CadastroProduto) : CadastroProduto {

        return cadastroProdutoRepository.save(cadastroProduto);
    }

}
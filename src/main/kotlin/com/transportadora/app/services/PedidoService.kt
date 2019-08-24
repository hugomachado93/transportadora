package com.transportadora.app.services

import com.transportadora.app.model.CadastroProduto
import com.transportadora.app.model.Pedido
import com.transportadora.app.model.ProdutoCompra
import com.transportadora.app.repositories.CadastroProdutoRepository
import com.transportadora.app.repositories.PedidoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PedidoService(@Autowired val pedidoRepository: PedidoRepository,
                    @Autowired val cadastroProdutoRepository: CadastroProdutoRepository) {


    fun criaPedido(produtoCompra : ProdutoCompra){

        var cadastroProdutos = mutableSetOf<CadastroProduto>()

        produtoCompra.produtos.forEach { p ->
            val cadastroProduto = cadastroProdutoRepository.findById(p.id)
            cadastroProdutos.add(cadastroProduto.get())
        }

        val pedido = Pedido(0, cadastroProdutos)

        pedidoRepository.save(pedido)
    }

}
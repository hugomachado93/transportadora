package com.transportadora.app.controllers

import com.transportadora.app.model.ProdutoCompra
import com.transportadora.app.services.PedidoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PedidoController(@Autowired val pedidoService: PedidoService) {

    @PostMapping("/pedido")
    fun RealizaPedido(@RequestBody produtoCompra: ProdutoCompra) {
        pedidoService.criaPedido(produtoCompra)
    }

}
package com.transportadora.app

import com.transportadora.app.model.CadastroProduto
import com.transportadora.app.model.Pedido
import com.transportadora.app.repositories.CadastroProdutoRepository
import com.transportadora.app.repositories.PedidoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class AppApplication @Autowired constructor(
        val cadastroProdutoRepository: CadastroProdutoRepository,
        val pedidoRepository: PedidoRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {

        var p1 = Pedido(0)
        var p2 = Pedido(0)

        pedidoRepository.saveAll(Arrays.asList(p1, p2))

        var cp1 = CadastroProduto(0,"produto teste", 0.0, p1)
        var cp2 = CadastroProduto(0, "t1", 0.1, p2)


        cadastroProdutoRepository.saveAll(Arrays.asList(cp1, cp2))

    }
}

fun main(args: Array<String>) {
    runApplication<AppApplication>(*args)
}

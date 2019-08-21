package com.transportadora.app.model

import javax.persistence.*

@Entity
data class CadastroProduto(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        val produto: String,

        val preco: Double,

        @ManyToOne
        @JoinColumn(name = "pedido_id", nullable = false)
        val pedido : Pedido
)
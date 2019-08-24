package com.transportadora.app.model

import org.springframework.lang.Nullable
import java.io.Serializable
import javax.persistence.*

@Entity
data class CadastroProduto(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        val nomeProduto : String,

        val preco: Double,

        @ManyToOne
        @JoinColumn(name = "pedido_id")
        val pedido : Pedido?
) : Serializable
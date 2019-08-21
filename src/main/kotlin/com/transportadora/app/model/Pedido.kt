package com.transportadora.app.model

import javax.persistence.*

@Entity
data class Pedido(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Int,

        @OneToMany(mappedBy = "pedido")
        val produtos: Set<CadastroProduto> = setOf()

)
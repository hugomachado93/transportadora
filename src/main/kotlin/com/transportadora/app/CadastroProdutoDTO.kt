package com.transportadora.app

import java.io.Serializable


data class CadastroProdutoDTO(

        val nomeProduto : String,

        val preco: Double

) : Serializable
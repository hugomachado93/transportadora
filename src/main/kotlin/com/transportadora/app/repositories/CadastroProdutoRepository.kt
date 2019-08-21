package com.transportadora.app.repositories

import com.transportadora.app.model.CadastroProduto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CadastroProdutoRepository : JpaRepository<CadastroProduto, Int> {

}
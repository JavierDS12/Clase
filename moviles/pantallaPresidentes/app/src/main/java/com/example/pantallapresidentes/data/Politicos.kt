package com.example.pantallapresidentes.data

import com.example.pantallapresidentes.domain.model.Politico

object Politicos {
    private val politicos = mutableListOf(
        Politico("fernando", "BASURILLAS", 0),
        Politico("MAriCarmen","Panteras Grises",0,)
    )

    fun damePresidente() = politicos[1]
}
package br.sp.gov.tec.livrosapi.model

data class Livro(
    val id: Long? = null,
    val titulo: String,
    val autor: String,
    val ano: Int
)
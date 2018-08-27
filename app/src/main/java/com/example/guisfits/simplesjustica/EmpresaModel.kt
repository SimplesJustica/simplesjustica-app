package com.example.guisfits.simplesjustica

class EmpresaModel(nm: String, desc: String, dms: Int) {
    var id: Int = 0
    var nome: String = ""
    var descricao: String = ""
    var demandas: Int = 0

    init {
        this.nome = nm
        this.demandas = dms
        this.descricao = desc
    }
}
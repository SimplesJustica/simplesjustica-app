class EmpresaModel {
    var id: Int
    var nome: String
    var descricao: String
    var demandas: Int

    constructor(id: Int, nome: String, descricao: String, demandas: Int){
        this.id = id
        this.nome = nome
        this.descricao = descricao
        this.demandas = demandas
    }
}
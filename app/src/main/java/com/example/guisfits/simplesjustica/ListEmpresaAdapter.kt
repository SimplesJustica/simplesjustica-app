package com.example.guisfits.simplesjustica

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListExampleAdapter(context: Context, list: ArrayList<EmpresaModel>) : BaseAdapter() {
    var mInflator: LayoutInflater?=null
    var empresaList: ArrayList<EmpresaModel>?=null

    init {
        this.empresaList = list
        this.mInflator = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var view: View?

        if(convertView == null){
            view = this.mInflator?.inflate(R.layout.list_row, parent, false)
        }
        else {
            view = convertView
        }

        var txtNome: TextView
        var txtDescricao: TextView
        var txtDemandas: TextView

        txtNome = view?.findViewById(R.id.nome) as TextView
        txtDescricao = view?.findViewById(R.id.descricao) as TextView
        txtDemandas = view?.findViewById(R.id.demandas) as TextView

        var model: EmpresaModel
        model = getItem(position)!!

        txtNome.setText(model.nome)
        txtDescricao.setText(model.descricao)
        txtDemandas.setText("Demandas: " + model.demandas.toString())

        return view!!
    }

    override fun getCount(): Int {
        return empresaList!!.size
    }

    override fun getItem(position: Int): EmpresaModel? {
        return empresaList?.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}
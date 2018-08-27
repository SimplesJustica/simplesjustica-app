package com.example.guisfits.simplesjustica

import android.content.Context
import android.content.Intent
import android.support.v4.app.ActivityCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.coroutines.experimental.coroutineContext

class ListExampleAdapter(context: Context, list: ArrayList<EmpresaModel>) : BaseAdapter() {
    var mInflator: LayoutInflater?=null
    var empresaList: ArrayList<EmpresaModel>?=null
    var myContext: Context

    init {
        this.empresaList = list
        this.mInflator = LayoutInflater.from(context)
        this.myContext = context
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
        var btnJuntesse: Button

        txtNome = view?.findViewById(R.id.nome) as TextView
        txtDescricao = view?.findViewById(R.id.descricao) as TextView
        txtDemandas = view?.findViewById(R.id.demandas) as TextView
        btnJuntesse = view?.findViewById(R.id.btnJuntese) as Button

        var model: EmpresaModel
        model = getItem(position)!!

        txtNome.setText(model.nome)
        txtDescricao.setText(model.descricao)
        txtDemandas.setText("Demandas: " + model.demandas.toString())

        btnJuntesse.setOnClickListener(View.OnClickListener {
            var intent = Intent(myContext, ReclamacaoForm::class.java)
            myContext.startActivity(intent)
        })

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
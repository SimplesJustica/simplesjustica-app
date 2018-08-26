package com.example.guisfits.simplesjustica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var empresaList: ArrayList<EmpresaModel>
        empresaList = ArrayList()
        empresaList.add(EmpresaModel("Net", "abc", 3))
        empresaList.add(EmpresaModel("Claro", "acsdfs", 5))
        empresaList.add(EmpresaModel("Vivo", "a3454", 7))

        var adapter: ListExampleAdapter

        adapter = ListExampleAdapter(context = this, list = empresaList)
        empresaListView.adapter = adapter
    }
}

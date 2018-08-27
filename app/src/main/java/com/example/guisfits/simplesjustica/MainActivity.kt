package com.example.guisfits.simplesjustica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
        var empresaList: ArrayList<EmpresaModel>
        empresaList = ArrayList()
        empresaList.add(EmpresaModel("Net", lorem, 127))
        empresaList.add(EmpresaModel("Claro", lorem, 109))
        empresaList.add(EmpresaModel("Vivo", lorem, 78))
        empresaList.add(EmpresaModel("Nextel", lorem, 67))
        empresaList.add(EmpresaModel("Sky", lorem, 70))

        var adapter: ListExampleAdapter

        adapter = ListExampleAdapter(context = this, list = empresaList)
        empresaListView.adapter = adapter
    }
}

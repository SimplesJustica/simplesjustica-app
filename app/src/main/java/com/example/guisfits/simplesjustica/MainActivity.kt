package com.example.guisfits.simplesjustica

import android.content.Context
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv = findViewById(R.id.list) as ListView
        lv.adapter = ListExampleAdapter(this)
    }


    private class ListExampleAdapter(context: Context) : BaseAdapter() {

        val empresaNet = EmpresaModel("Net", "jasdhsdjkfhjk sd", 3)
        internal var empresaList = arrayOf<EmpresaModel>(empresaNet, EmpresaModel("Claro", "asdfsdfds", 109))

        private val mInflator: LayoutInflater

        init {
            this.mInflator = LayoutInflater.from(context)
        }

        override fun getCount(): Int {
            return empresaList.size
        }

        override fun getItem(position: Int): Any {
            return empresaList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
            val view: View?
            if (convertView == null) {
                view = this.mInflator.inflate(R.layout.list_row, parent, false)
            } else {
                view = convertView
            }
            // TODO Setar os elementos da view pros elementos da lista
            return view
        }
    }
}

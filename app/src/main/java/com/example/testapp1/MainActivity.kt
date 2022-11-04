package com.example.testapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista: ArrayList<ArrayList<String>> = ArrayList<ArrayList<String>>()
        lista.add(arrayListOf("1","Robert","Biedron"))
        lista.add(arrayListOf("2","Piorr","Biedron"))
        lista.add(arrayListOf("3","Adam","Biedron"))

        val recyk: RecyclerView = this.findViewById<RecyclerView>(R.id.recyk)
        recyk.adapter=MyAdapter(lista)
    }
}
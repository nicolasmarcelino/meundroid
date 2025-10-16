package com.example.androidstudies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DigitalizacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = arrayOf(
            DigitalizacaoItem("2357911", "10-30", "111111", "Em fila"),
            DigitalizacaoItem("357012", "47-50", "222222", "Em fila"),
            DigitalizacaoItem("5832523", "2-3", "3333333", "Concluído")
        )

        val customAdapter = CustomAdapter(dataset)

        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = customAdapter
    }
}
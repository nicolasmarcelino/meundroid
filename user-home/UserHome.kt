package com.example.androidstudies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home)

        val dataset = arrayOf(
            QuickBook(R.drawable.book_01, "Gerenciamento de serviços de TI na prática", "2 dias restantes"),
            QuickBook(R.drawable.book_02, "Governança de TI", "15 dias restantes"),
            QuickBook(R.drawable.book_03, "Sistemas de Informação", "2 dias atrasado")
        )

        val dataset_2 = arrayOf(
            QuickBook(R.drawable.book_01, "Gerenciamento de serviços de TI na prática", "2 dias restantes"),
            QuickBook(R.drawable.book_02, "Governança de TI", "15 dias restantes"),
            QuickBook(R.drawable.book_03, "Sistemas de Informação", "2 dias atrasado")
        )

        val quickBookAdapter = QuickBookAdapter(dataset)

        val recyclerView: RecyclerView = findViewById(R.id.quickBookRecycler)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = quickBookAdapter

        val quickPlaceAdapter = QuickPlaceAdapter(dataset)

        val recyclerView2: RecyclerView = findViewById(R.id.quickPlaceRecycler)
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = quickPlaceAdapter
    }
}
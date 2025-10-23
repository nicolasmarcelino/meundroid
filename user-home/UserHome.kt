package com.example.androidstudies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home)

        val dataset_2 = arrayOf(
            QuickPlace(R.drawable.ic_quickplace, "Sala 12", "24/09/2025 11:00\n24/09/2025 11:00"),
            QuickPlace(R.drawable.book_01, "Gerencimento de TI", "Disponível"),
            QuickPlace(R.drawable.book_03, "Sistemas de Informação", "3 dias")
        )

        val quickBookAdapter = QuickPlaceAdapter(dataset_2)

        val recyclerView: RecyclerView = findViewById(R.id.quickBookRecycler)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = quickBookAdapter

        val quickPlaceAdapter = QuickPlaceAdapter(dataset_2)

        val recyclerView2: RecyclerView = findViewById(R.id.quickPlaceRecycler)
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = quickPlaceAdapter
    }
}
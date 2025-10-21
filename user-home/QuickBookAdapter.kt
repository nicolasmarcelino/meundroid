package com.example.androidstudies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuickBookAdapter(private val dataSet: Array<QuickBook>) :
    RecyclerView.Adapter<QuickBookAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val capa: ImageView = view.findViewById(R.id.quickBookCapa)
        val titulo: TextView = view.findViewById(R.id.quickBookTitulo)
        val devolucao: TextView = view.findViewById(R.id.quickBookDevolucao)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.quick_book_view, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.capa.setImageResource(dataSet[position].capa)
        viewHolder.titulo.text = dataSet[position].titulo
        viewHolder.devolucao.text = dataSet[position].devolucao
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
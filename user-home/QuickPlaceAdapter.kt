package com.example.androidstudies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuickPlaceAdapter(private val dataSet: Array<QuickBook>) :
    RecyclerView.Adapter<QuickPlaceAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val icone: ImageView = view.findViewById(R.id.quickPlaceBookIcone)
        val sala: TextView = view.findViewById(R.id.quickPlaceSala)
        val dataHora: TextView = view.findViewById(R.id.quickPlaceDataHora)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.quick_place_view, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.icone.setImageResource(dataSet[position].capa)
        viewHolder.sala.text = dataSet[position].titulo
        viewHolder.dataHora.text = dataSet[position].devolucao
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
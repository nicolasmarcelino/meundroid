package com.example.androidstudies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: Array<DigitalizacaoItem>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val requisitante: TextView = view.findViewById(R.id.dataRequisitante)
        val paginas: TextView = view.findViewById(R.id.dataPaginas)
        val registro: TextView = view.findViewById(R.id.dataRegistro)
        val status : TextView = view.findViewById(R.id.dataStatus)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_digitalizacao, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.requisitante.text = dataSet[position].requisitante
        viewHolder.paginas.text = dataSet[position].paginas
        viewHolder.registro.text = dataSet[position].registro
        viewHolder.status.text = dataSet[position].status
    }

    override fun getItemCount() = dataSet.size

}
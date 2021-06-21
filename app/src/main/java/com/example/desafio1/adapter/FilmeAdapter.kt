package com.example.desafio1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio1.R
import com.example.desafio1.model.FilmeItem
import kotlinx.android.synthetic.main.list_item.view.*


class FilmeAdapter(val listaFilmes: List<FilmeItem>, val context: Context) :
    RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val filmeView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return FilmeViewHolder(filmeView)
    }


    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val filmeAtual = listaFilmes[position]

        holder.imageViewCapa.setImageResource(filmeAtual.imagemCapa)
        holder.textViewNota.text = filmeAtual.nota
        holder.textViewTitulo.text = filmeAtual.titulo
        holder.textViewCategoria.text = filmeAtual.categoria
        holder.textViewPais.text = filmeAtual.paisFilme
        holder.textViewDescricao.text = filmeAtual.descricao

    }

    override fun getItemCount(): Int {
        return listaFilmes.size
    }

    class FilmeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewCapa: ImageView = itemView.imageCapaFilme
        val textViewNota: TextView = itemView.textNotaFilme
        val textViewTitulo: TextView = itemView.textTituloFilme
        val textViewCategoria: TextView = itemView.textCategoria
        val textViewPais: TextView = itemView.textPais
        val textViewDescricao: TextView = itemView.textDescricao
    }
}
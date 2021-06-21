package com.example.desafio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio1.adapter.FilmeAdapter
import com.example.desafio1.model.FilmeItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        val listaFilmes = gerarFilmes(100)

        //Lista de Categorias
       // val listaCategoria = listOf("Aventura","Ação","Comédia","Romance")
       // recyclerView.adapter = CategoriaAdapter(listaCategoria, this)


        recyclerView.adapter = FilmeAdapter(listaFilmes, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun gerarFilmes(size: Int): List<FilmeItem> {

        val list = ArrayList<FilmeItem>()

        for (i in 1 until size) {
            val idVingadores = R.drawable.avengers
           // val idAvatar = R.drawable.avatar2

            val item = FilmeItem(
                idVingadores,
                "8.5", "Avatar",
                "Aventura", "Estados Unidos", "No exuberante " +
                        "mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser" +
                        " primitivos, mas são altamente evoluídos. Como o ambiente do planeta" +
                        " é tóxico, foram criados os avatares, corpos biológicos controlados pela" +
                        " mente humana que se movimentam livremente em Pandora. Jake Sully, um ex-fuzileiro"
            )
            list += item
        }
        return list
    }
}
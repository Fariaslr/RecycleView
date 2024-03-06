package com.lukecompany.recycleview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.lukecompany.recycleview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()
    }

    private fun initRecycleView(){
        binding.reclycleView.layoutManager = LinearLayoutManager(this)
        binding.reclycleView.setHasFixedSize(true)
        binding.reclycleView.adapter = Adapter(getList()){
            name-> Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun getList() = listOf(
        "Ana Carolina Pereira",
        "Lucas Oliveira Santos",
        "Mariana Silva Costa",
        "Felipe Rocha Almeida",
        "Isabela Rodrigues Lima",
        "Rafael Martins Oliveira",
        "Gabriela Santos Almeida",
        "Gustavo Costa Pereira",
        "Larissa Fernandes Lima",
        "Matheus Oliveira Silva",
        "Bianca Santos Costa",
        "Pedro Almeida Rocha",
        "Camila Lima Rodrigues",
        "Thiago Pereira Silva",
        "Amanda Fernandes Costa",
        "João Silva Martins",
        "Natália Costa Oliveira",
        "Guilherme Rocha Santos",
        "Laura Almeida Lima",
        "Henrique Oliveira Costa",
        "Clara Santos Pereira",
        "Bruno Lima Rodrigues",
        "Juliana Costa Silva",
        "Leonardo Martins Almeida",
        "Marina Rocha Lima",
        "Lucas Fernandes Pereira",
        "Carolina Silva Santos",
        "Vinícius Lima Costa",
        "Mariana Almeida Rodrigues",
        "André Pereira Martins",
        "Beatriz Lima Oliveira",
        "Thiago Rodrigues Silva",
        "Carla Costa Santos",
        "Diego Oliveira Pereira",
        "Fernanda Lima Rodrigues",
        "Ricardo Santos Costa",
        "Luana Almeida Silva",
        "Pedro Martins Oliveira",
        "Ana Paula Fernandes Lima",
        "Felipe Lima Pereira",
        "Giovanna Santos Costa",
        "Rodrigo Rocha Almeida",
        "Aline Oliveira Martins",
        "Matias Silva Costa",
        "Catarina Pereira Lima",
        "Renato Lima Santos",
        "Helena Martins Oliveira"
    )

}
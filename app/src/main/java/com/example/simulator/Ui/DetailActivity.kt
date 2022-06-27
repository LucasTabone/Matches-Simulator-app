package com.example.simulator.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simulator.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private fun setupMatchesList() {
        TODO("Listar as partidas")
    }

    private fun setupMatchesRefresh() {
        TODO("atualizar as partidas na ação swipe")
    }

    private fun setupFloatingActionButton() {
        TODO("Criar evento de Click")
    }


}
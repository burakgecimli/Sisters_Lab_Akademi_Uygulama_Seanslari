package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app1.databinding.ActivityFilmListBinding

class FilmListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFilmListBinding
    private lateinit var filmList: ArrayList<FilmModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFilmListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val getNameIntent = intent.getStringExtra("name")
        val getDirectorIntent = intent.getStringExtra("director")
        val getScoreIntent = intent.getStringExtra("score")


        val film1 = FilmModel("Film 1", "Film 1 Yönetmen", "10")
        val film2 = FilmModel("Film 2", "Film 2 Yönetmen", "8")
        val film3 = FilmModel(getNameIntent ?: "null", getDirectorIntent ?: "null", getScoreIntent ?: "0")

        filmList = ArrayList<FilmModel>()
        filmList.add(film1)
        filmList.add(film2)
        filmList.add(film3)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = FilmAdapter(this@FilmListActivity, filmList)


    }
}
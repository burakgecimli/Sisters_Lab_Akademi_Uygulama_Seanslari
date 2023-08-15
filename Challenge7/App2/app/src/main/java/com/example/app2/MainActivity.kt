package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var hobbyList: ArrayList<HobbyModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bake = HobbyModel("Bake", R.drawable.bake)
        val joystick = HobbyModel("Play video games", R.drawable.joystick)
        val music = HobbyModel("Listen to music", R.drawable.listening)
        val movies = HobbyModel("Watch the movies", R.drawable.movies)
        val piano = HobbyModel("Play the piano", R.drawable.piano)
        val football = HobbyModel("Play the footbaall", R.drawable.play)
        val travel = HobbyModel("Travel abroad", R.drawable.travel)
        val fitness = HobbyModel("Fitness", R.drawable.weightlifter)


        hobbyList = ArrayList<HobbyModel>()

        hobbyList.add(bake)
        hobbyList.add(joystick)
        hobbyList.add(music)
        hobbyList.add(movies)
        hobbyList.add(piano)
        hobbyList.add(football)
        hobbyList.add(travel)
        hobbyList.add(fitness)


        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = HobbyAdapter(this, hobbyList)


    }


}
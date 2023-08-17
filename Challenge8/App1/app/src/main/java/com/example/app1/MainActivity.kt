package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.button.setOnClickListener {

            val filmName = binding.editTextFilmName.text.toString()
            val filmDirector = binding.editTextFilmDirector.text.toString()
            val filmScore = binding.editTextFilmPoint.text.toString()

            if (filmName.trim().isEmpty() || filmDirector.trim().isEmpty() || filmScore.isEmpty()) {
                Toast.makeText(this, "You can not empty value", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@MainActivity, FilmListActivity::class.java)
                intent.putExtra("name", filmName)
                intent.putExtra("director", filmDirector)
                intent.putExtra("score", filmScore)
                startActivity(intent)
            }


        }


    }


}
package com.example.navigationdrawer

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navigationView, navHostFragment.navController)

        binding.toolbar.title = "Title"
        binding.toolbar.setTitleTextColor(Color.parseColor("#ffffff"))
        val toggle = ActionBarDrawerToggle(this, binding.drawer, binding.toolbar, 0, 0)

        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()


       val title = binding.navigationView.inflateHeaderView(R.layout.navigation_title)


    }

    override fun onBackPressed() {
        super.onBackPressed()

        if (binding.drawer.isDrawerOpen(GravityCompat.START)) {
            binding.drawer.isDrawerOpen(GravityCompat.START)
        } else {
            onBackPressedDispatcher.onBackPressed()
        }

    }
}
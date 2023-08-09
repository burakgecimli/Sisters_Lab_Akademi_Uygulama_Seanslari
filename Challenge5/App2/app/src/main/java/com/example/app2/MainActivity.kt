package com.example.app2

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Window
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.example.app2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val name: String = binding.editTextName.text.toString()
            val number: String = binding.editTextPhone.text.toString()

            if (name.isEmpty()) {
                showCustomDialog()
            } else if (number.isEmpty()) {
                showCustomDialog()
            } else {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

            }
        }


    }

    private fun showCustomDialog() {
        val dialogBinding = layoutInflater.inflate(R.layout.layout_custom_dialog, null)
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(dialogBinding)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
       // dialog.getWindow()?.setLayout(700,400 )
        dialog.show()



        val okButton = dialogBinding.findViewById<Button>(R.id.buttonOk)
        okButton.setOnClickListener {
            dialog.dismiss()
        }




    }
}
package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var username = "admin"
        var password = "admin123"

        binding.btnSignIn.setOnClickListener()
        {
            var user:String = binding.editTxtUsername.text.toString()
            var pass:String = binding.editTxtPassword.text.toString()

            if (user == username && pass == password)
            {
                val intent = Intent(this, Menu::class.java)
                startActivity(intent)
            }
            else if(user == "" && pass == "")
            {
                Toast.makeText(applicationContext, "Please enter a username/password", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext, "Invalid!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
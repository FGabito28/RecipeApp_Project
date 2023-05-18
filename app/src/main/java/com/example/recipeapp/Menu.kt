package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipeapp.databinding.ActivityMenuBinding


class Menu : AppCompatActivity()
{
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.food1.setOnClickListener()
        {
            val intent = Intent(this,food1::class.java)
            startActivity(intent)
        }
        binding.food2.setOnClickListener()
        {
            val intent = Intent(this,food2::class.java)
            startActivity(intent)
        }
        binding.food3.setOnClickListener()
        {
            val intent = Intent(this,food3::class.java)
            startActivity(intent)
        }
        binding.food4.setOnClickListener()
        {
            val intent = Intent(this,food4::class.java)
            startActivity(intent)
        }
        binding.food5.setOnClickListener()
        {
            val intent = Intent(this,food5::class.java)
            startActivity(intent)
        }
        binding.food6.setOnClickListener()
        {
            val intent = Intent(this,food6::class.java)
            startActivity(intent)
        }
        binding.btnAboutUs.setOnClickListener()
        {
            val intent = Intent(this,AboutUs::class.java)
            startActivity(intent)
        }
    }
}
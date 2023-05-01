package com.example.zeldaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.zeldaapp.category.presentation.type.CategoryTypeListViewModel
import com.example.zeldaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel:CategoryTypeListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(CategoryTypeListViewModel::class.java)
        binding.apply {
            setContentView(binding.root)
            supportFragmentManager.findFragmentById(R.id.nav_graph)?.findNavController()
        }
    }

}
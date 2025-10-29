package com.example.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Inflate the layout using view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Set the content view to the root of the binding
        setContentView(binding.root)
        
        // That's it! All the UI is in the XML files.
        // A real app would now set click listeners,
        // load music, etc.
    }
}

package com.chev.finaltask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.chev.finaltask.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment)
    }
}
